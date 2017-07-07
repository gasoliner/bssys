package cn.bssys.controller;

import cn.bssys.service.SystemDDLService;
import cn.bssys.vo.VoSystemDDL;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 万洪基 on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/systemddl",produces = {"application/json;charset=UTF-8"} )
public class SystemDDLController {

    @Autowired
    SystemDDLService systemDDLService;

    @RequestMapping("/keyword")
    @ResponseBody
    public String getKeyword() throws Exception{
        return JSON.toJSONString(systemDDLService.getKeyword());
    }
    @RequestMapping("/list/{keyword}")
    @ResponseBody
    public String getList(@PathVariable String keyword) throws Exception{
        return JSON.toJSONString(systemDDLService.getListByKeyword(keyword));
    }
    @RequiresPermissions("systemddl:*")
    @RequestMapping("/addition")
    @ResponseBody
    public String addition(VoSystemDDL systemDDL) throws Exception{
        try {
            systemDDLService.add(systemDDL);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("systemddl:*")
    @RequestMapping("/updates/{uuid}")
    @ResponseBody
    public String updates(@PathVariable String uuid, VoSystemDDL voSystemDDL) throws Exception {
        voSystemDDL.setUuid(uuid);
        try {
            systemDDLService.update(voSystemDDL);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("systemddl:*")
    @RequestMapping(value = "/deletion/{uuid}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable String uuid) throws Exception {
        try {
            systemDDLService.delete(uuid);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }

}
