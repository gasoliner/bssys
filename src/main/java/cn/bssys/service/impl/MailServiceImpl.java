package cn.bssys.service.impl;

import cn.bssys.po.Email;
import cn.bssys.service.MailService;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


/**
 * Created by LENOVO on 2017/8/3.
 */
@Service("mailService")
 public class MailServiceImpl implements MailService {
    //用于给用户发送邮件的邮箱
    private String from = "17864307797@163.com";
    //邮箱的用户名
    private String username = "17864307797";
    //邮箱的密码
    private String password = "liulihui123";
    //发送邮件的服务器地址
    private String host = "smtp.163.com";


    public void createMail() throws Exception {
        Properties prop = new Properties();
        prop.setProperty("mail.host", host);
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        Session session = Session.getInstance(prop);
        session.setDebug(true);
        Transport ts = session.getTransport();
//        ts.connect(host, username, password);
//        163邮箱connect方法，第三个参数应该是授权码，而不是密码.
        ts.connect(host, username, "liulihui123");
        //创建邮件
        Message message = sendEamil(session);
        //发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
    }

    @Override
    public Message sendEamil(Email email) {

        String from = "17864307797@163.com";

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("820727003@qq.com"));
//        message.setRecipient(Message.RecipientType.TO, new InternetAddress("3053218092@qq.com"));
//        message.setRecipient(Message.RecipientType.TO, new InternetAddress("llhui7797@sohu.com"));
//        message.setRecipient(Message.RecipientType.TO, new InternetAddress("shenguanchu@126.com"));
        message.setSubject("用户注册邮件");

        String info = "Tanya Chua has composed songs for many heavyweight singers, including pop diva Faye Wong, Eason Chan, Na Ying and Stefanie Sun.\n" +
                " \n" +
                "In 1999, Chua signed a recording1 deal with PolyGram, which was acquired by Universal Music Group a year later.\n" +
                " \n" +
                "The company helped the singer release2 her first self-titled Chinese album.";
        message.setContent(info, "text/html;charset=UTF-8");
        message.saveChanges();
        return message;
    }


}
