package cn.bssys.service.impl;

import cn.bssys.po.Email;
import cn.bssys.service.MailService;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


/**
 * Created by LENOVO on 2017/8/3.
 */
@Service("mailService")
 public class MailServiceImpl extends Thread implements MailService{
    private Session session = null;

    private Properties prop = null;

    private Transport ts = null;

    public MailServiceImpl() throws Exception {
        System.setProperty("mail.mime.charset","UTF-8");
        prop = new Properties();
        InputStream in = this.getClass().getResourceAsStream("/mail.properties");
        prop.load(in);

    }

    public void connect()throws Exception{
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

    @Override
    public boolean sendEamil(Email email) {
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
        }
        return flag;
    }
}

