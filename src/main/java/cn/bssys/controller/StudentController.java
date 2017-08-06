package cn.bssys.controller;

import cn.bssys.po.BsStudent;
import cn.bssys.po.DataGrid;
import cn.bssys.po.Page;
import cn.bssys.service.StudentService;
import cn.bssys.service.UserService;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
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
@RequestMapping(value = "/student", produces = {"application/json;charset=UTF-8"})
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public String getList(Page page) throws Exception {
        DataGrid dataGrid = new DataGrid();
        dataGrid.setTotal(studentService.getTotal());
        dataGrid.setRows(studentService.getList(page));
        return JSON.toJSONString(dataGrid);
    }


    @RequestMapping("/addition")
    @ResponseBody
    public String addition(BsStudent bsStudent) throws Exception {
        bsStudent.setIschoose(0);
        bsStudent.setPassword(bsStudent.getNumber());
        try {
            studentService.add(bsStudent);
            return JSON.toJSONString("操作成功");
        } catch (Exception e) {
            return JSON.toJSONString("操作失败");
        }
    }

    @RequestMapping("/updates/{sid}")
    @ResponseBody
    public String update(@PathVariable int sid, BsStudent bsStudent) throws Exception {
        bsStudent.setSid(sid);
        try {
            studentService.update(bsStudent);
            return JSON.toJSONString("操作成功");
        } catch (Exception e) {
            return JSON.toJSONString("操作失败");
        }

    }

    @RequestMapping(value = "/deletion/{sid}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable int sid) throws Exception {
        try {
            studentService.delete(sid);
            return JSON.toJSONString("操作成功");
        } catch (Exception e) {
            return JSON.toJSONString("操作失败");
        }
    }

    @RequestMapping("/tid/{tid}")
    @ResponseBody
    public String getStuByTid(@PathVariable Integer tid){
        return JSON.toJSONString(studentService.getStudentByTid(tid));
    }


    @RequestMapping("/mine/{tid}")
    @ResponseBody
    public String getStudentList(@PathVariable Integer tid){
        return  JSON.toJSONString(studentService.myStudentList(tid));
    }

    @RequestMapping("/timeAndPlace/{year}")
    @ResponseBody
    public String timeplaceList(Page page,@PathVariable int year){
        DataGrid dataGrid = new DataGrid();
        dataGrid.setTotal(studentService.getTotal());
        dataGrid.setRows(studentService.timePlaceList(page,year));
        return JSON.toJSONString(dataGrid);
    }

}
