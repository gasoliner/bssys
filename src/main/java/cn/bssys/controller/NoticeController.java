package cn.bssys.controller;

import cn.bssys.po.Page;
import cn.bssys.service.NoticeService;
import cn.bssys.util.PageUtil;
import cn.bssys.vo.VoNotice;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 万洪基 on 2017/6/30.
 */
@Controller
@RequestMapping(value = "/notice",produces = {"application/json;charset=UTF-8"} )
public class NoticeController {
    @Autowired
    NoticeService noticeService;


    @RequestMapping("/list")
    @ResponseBody
    public String getList(Page page) throws Exception{
        return JSON.toJSONString(noticeService.getList(page));
    }
    @RequiresPermissions("notice:*")
    @RequestMapping("/addition")
    @ResponseBody
    public String addition(VoNotice notice , @RequestParam("file")CommonsMultipartFile file , HttpServletRequest request) throws Exception{
        notice.setAnnex(PageUtil.uploadAnnex(request,file,"notice",notice.getTitle()));
        try {
            noticeService.add(notice);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("notice:*")
    @RequestMapping("/updates/{uuid}")
    @ResponseBody
    public String updates(@PathVariable String uuid, VoNotice voNotice, @RequestParam("file")CommonsMultipartFile file , HttpServletRequest request) throws Exception {
        voNotice.setUuid(uuid);
        if (!file.isEmpty()){
            voNotice.setAnnex(PageUtil.uploadAnnex(request,file,"notice",voNotice.getTitle()));
        }
        try {
            noticeService.update(voNotice);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequiresPermissions("notice:*")
    @RequestMapping(value = "/deletion/{uuid}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable String uuid) throws Exception {
        try {
            noticeService.delete(uuid);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequestMapping("/download/{uuid}")
    public void download(@PathVariable String uuid, HttpServletResponse response) throws Exception {
        PageUtil.downloadFile(noticeService.getObjectByPrimaryKey(uuid).getAnnex(),response);
        return;
    }
}
