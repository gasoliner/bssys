package cn.bssys.service;

import cn.bssys.po.Email;

import javax.mail.Message;
import javax.mail.Session;

/**
 * Created by LENOVO on 2017/8/3.
 */
public interface MailService  {


    public boolean sendEamil(Email email) ;



}
