package cn.bssys.controller;

import cn.bssys.po.Email;
import cn.bssys.service.MailService;
import cn.bssys.service.StudentService;
import cn.bssys.util.PageUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 万洪基 on 2017/8/3.
 */
@Controller
@RequestMapping(value = "/mail",produces = {"application/json;charset=UTF-8"} )
public class MailController {

    @Autowired
    MailService mailService;

    @Autowired
    StudentService studentService;

    @RequestMapping("/send")
    @ResponseBody
    public String sendEmail(Email email, @RequestParam(value = "file",required = false)CommonsMultipartFile file, HttpServletRequest request){
        if (!file.isEmpty()){
            email.setAttachment(PageUtil.uploadAnnex(request,file,"cache","email_attachment"));
        }
        System.out.println(email);
        System.out.println(email.getRecipient().length);
        for (int i = 0;i < email.getRecipient().length;i++){
            email.getRecipient()[i] = studentService.getObjectByPrimaryKey(Integer.parseInt(email.getRecipient()[i])).getEmail();
        }
        System.out.println(email);
        if (mailService.sendEamil(email)){
            return JSON.toJSONString("发送成功");
        }else {
            return JSON.toJSONString("发送失败，请稍后再试");
        }
    }


}
