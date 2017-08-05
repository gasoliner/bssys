package cn.bssys.controller;

import cn.bssys.po.BsUser;
import cn.bssys.po.DataGrid;
import cn.bssys.po.Page;
import cn.bssys.service.UserService;
import cn.bssys.util.ContantKey;
import cn.bssys.vo.VoUser;
import cn.bssys.vo.VodefenseGroup;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 万洪基 on 2017/7/4.
 */
@Controller
@RequestMapping(value = "/user",produces = {"application/json;charset=UTF-8"} )
public class UserController {

    @Autowired
    UserService userService;

//    映射URL /user/login
    @RequestMapping("/login")
    @ResponseBody
    public String login(VoUser voUser, HttpSession  session){
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(
                voUser.getEmployeenum(),
                voUser.getPassword()
        );
        try {
            currentUser.login(token);
            System.out.println("login successful!!");
            BsUser user = userService.getUserByEmployenum(voUser.getEmployeenum());
            session.setAttribute(ContantKey.GLOBLE_USER_INFO,new VoUser(user));
//            返回主用户界面
            return "/";
        }catch (UnknownAccountException uae){
            System.out.println("用户名错误");
        }catch (LockedAccountException lae){
            System.out.println("账户锁定了");
        }
//        返回login页面
        return "/login";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public void logout(){
        System.out.println("logout started!!");
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return;
    }


    @RequestMapping("/list")
    @ResponseBody
    public String getList(Page page){
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(userService.getList(page));
        dataGrid.setTotal(userService.getTotal());
        return JSON.toJSONString(dataGrid);
    }

    @RequiresPermissions("user:*")
    @RequestMapping("/addition")
    @ResponseBody
    public String addition(VoUser voUser) throws Exception{
        try {
            userService.add(voUser);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequestMapping("/updates/{id}")
    @ResponseBody
    public String updates(@PathVariable Long id, VoUser voUser) throws Exception {
        voUser.setUid(id);
        try {
            userService.update(voUser);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("user:*")
    @RequestMapping(value = "/deletion/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable Long id) throws Exception {
        try {
            userService.delete(id);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }

}
