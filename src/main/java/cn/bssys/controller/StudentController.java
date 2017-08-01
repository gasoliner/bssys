package cn.bssys.controller;

import cn.bssys.po.BsStudent;
import cn.bssys.po.Page;
import cn.bssys.service.StudentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by LENOVO on 2017/8/1.
 */
@Controller
@RequestMapping(value = "/student",produces = {"application/json;charset=UTF-8"} )
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public String getList(Page page)throws Exception{
        System.out.print(page);
      return JSON.toJSONString(studentService.getList(page));
    }

    @RequestMapping("/addition")
    @ResponseBody
    public String addition(BsStudent bsStudent)throws  Exception{
        bsStudent.setIschoose(0);
        bsStudent.setPassword(bsStudent.getNumber());
        try{
            studentService.add(bsStudent);
            return JSON.toJSONString("操作成功");
        }catch(Exception e){
             return JSON.toJSONString("操作失败");
        }
    }

    @RequestMapping("/updates/{sid}")
    @ResponseBody
    public String update(@PathVariable int sid, BsStudent bsStudent)throws  Exception{
        bsStudent.setSid(sid);
        try {
            studentService.update(bsStudent);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }

    }

    @RequestMapping(value = "/deletion/{sid}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable int sid)throws  Exception{
        try{
            studentService.delete(sid);
            return JSON.toJSONString("操作成功");
        }catch(Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
}
