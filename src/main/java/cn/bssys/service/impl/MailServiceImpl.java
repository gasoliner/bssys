package cn.bssys.service.impl;

import cn.bssys.po.Email;
import cn.bssys.queue.EmailBlockingQueue;
import cn.bssys.service.MailService;
import cn.bssys.util.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.concurrent.TimeUnit;


/**
 * Created by LENOVO on 2017/8/3.
 */
@Service("mailService")
 public class MailServiceImpl extends Thread implements MailService{

    @Autowired
    private EmailSender emailSender;

    @Autowired
    private EmailBlockingQueue<Email> emailBlockingQueue;

    @Override
    public boolean sendEamil(Email email) {
        try {
            emailBlockingQueue.offer(email,2, TimeUnit.SECONDS);
            if (!emailSender.isRunning()) {
                emailSender.startSendWork();
            }
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}

