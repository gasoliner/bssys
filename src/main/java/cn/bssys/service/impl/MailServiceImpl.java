package cn.bssys.service.impl;

import cn.bssys.po.Email;
import cn.bssys.service.MailService;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Properties;


/**
 * Created by LENOVO on 2017/8/3.
 */
@Service("mailService")
 public class MailServiceImpl implements MailService {

    @Override
    public boolean sendEamil(Email email) {

        return true;
    }
}
