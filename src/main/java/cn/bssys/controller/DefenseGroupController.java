package cn.bssys.controller;

import cn.bssys.po.Page;
import cn.bssys.service.DefenseGroupService;
import cn.bssys.vo.VoTopic;
import cn.bssys.vo.VodefenseGroup;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 万洪基 on 2017/6/29.
 */
@Controller
@RequestMapping(value = "/defenseGroup",produces = {"application/json;charset=UTF-8"} )
public class DefenseGroupController {

    @Autowired
    DefenseGroupService defenseGroupService;

    @RequestMapping("/list")
    @ResponseBody
    public String getList(Page page){
        return JSON.toJSONString(defenseGroupService.getList(page));
    }

    @RequiresPermissions("defenseGroup:*")
    @RequestMapping("/addition")
    @ResponseBody
    public String addition(VodefenseGroup vodefenseGroup) throws Exception{
        try {
            defenseGroupService.add(vodefenseGroup);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("defenseGroup:*")
    @RequestMapping("/updates/{id}")
    @ResponseBody
    public String updates(@PathVariable Integer id, VodefenseGroup vodefenseGroup) throws Exception {
        vodefenseGroup.setId(id);
        try {
            defenseGroupService.update(vodefenseGroup);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("defenseGroup:*")
    @RequestMapping(value = "/deletion/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable Integer id) throws Exception {
        try {
            defenseGroupService.delete(id);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
}
