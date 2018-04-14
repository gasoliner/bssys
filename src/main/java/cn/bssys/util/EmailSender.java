package cn.bssys.util;

import cn.bssys.po.Email;
import cn.bssys.queue.EmailBlockingQueue;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ww on 2018/4/14.
 */
public class EmailSender {
    private volatile boolean isRunning = false;

    private Session session = null;

    private Properties prop = null;

    private Transport ts = null;

    private EmailBlockingQueue<Email> emailBlockingQueue;

    private final SendEmailThread sendEmailThread = new SendEmailThread();

    public EmailSender(EmailBlockingQueue emailBlockingQueue) throws IOException {
        System.setProperty("mail.mime.charset","UTF-8");
        prop = new Properties();
        InputStream in = this.getClass().getResourceAsStream("/mail.properties");
        prop.load(in);
        this.emailBlockingQueue = emailBlockingQueue;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void startSendWork() {
//        new一个单一线程对EmailBlockingQueue中的Email进行发送
        if (!sendEmailThread.isAlive()) {
            sendEmailThread.start();
        }
    }

    class SendEmailThread extends Thread {

        @Override
        public void run() {
            isRunning = true;
            while (true) {
                try {
                    Email email = emailBlockingQueue.poll(2, TimeUnit.SECONDS);
                    if (email == null) {
                        break;
                    }
                    send(email);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            isRunning = false;
        }

        private boolean send(Email email) {
            boolean flag = false;
            try {
                connect();
                String from = prop.getProperty("from");
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                for (int i = 0; i < email.getRecipient().length; i++) {
                    message.setRecipient(Message.RecipientType.TO, new InternetAddress(email.getRecipient()[i]));
                }
//                message.setSubject(email.getSubject());
                message.setSubject(email.getSubject(),"UTF-8");
                String info = email.getContent();
                message.setContent(info, "text/html;charset=UTF-8");
                if(email.getAttachment()!=null){
                    MimeBodyPart attach = new MimeBodyPart();
                    DataHandler dh = new DataHandler(new FileDataSource(email.getAttachment()));
                    attach.setDataHandler(dh);
                    attach.setFileName(dh.getName());
                    MimeMultipart mp = new MimeMultipart();
                    // mp.addBodyPart(text);
                    mp.addBodyPart(attach);
                    mp.setSubType("mixed");
                    message.setContent(mp);
                }
                message.saveChanges();
                ts.sendMessage(message, message.getAllRecipients());
                ts.close();
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
//                这里发送发生错误采用的策略：
//                1、存入数据库
//                2、发送通知给发送者告知情况
            }
            return flag;
        }

        private void connect()throws Exception{
            session = Session.getInstance(prop);
            session.setDebug(true);
            ts = session.getTransport();
//       ts.connect(host, username, password);
//      163邮箱connect方法，第三个参数应该是授权码，而不是密码.
            String host = prop.getProperty("host");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");
            ts.connect(host, username, password);
        }
    }
}
