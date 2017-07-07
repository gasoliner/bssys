package cn.bssys.controller;

import cn.bssys.po.Page;
import cn.bssys.service.TopicService;
import cn.bssys.vo.VoTopic;
import com.alibaba.fastjson.JSON;
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
@RequestMapping(value = "/topic",produces = {"application/json;charset=UTF-8"} )
public class TopicController {

    @Autowired
    TopicService topicService;


    @RequestMapping("/list/{year}")
    @ResponseBody
    public String getList(Page page,@PathVariable Integer year) throws Exception{
        return JSON.toJSONString(topicService.getList(page,year));
    }
    @RequestMapping("/addition")
    @ResponseBody
    public String addition(VoTopic topic) throws Exception{
        try {
            topicService.add(topic);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequestMapping("/updates/{id}")
    @ResponseBody
    public String updates(@PathVariable Integer id, VoTopic voTopic) throws Exception {
        voTopic.setToid(id);
        try {
            topicService.update(voTopic);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }
    @RequestMapping(value = "/deletion/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deletion(@PathVariable Integer id) throws Exception {
        try {
            topicService.delete(id);
            return JSON.toJSONString("操作成功");
        }catch (Exception e){
            return JSON.toJSONString("操作失败");
        }
    }

}
