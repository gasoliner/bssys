package cn.bssys.service;

import cn.bssys.po.BsTopic;
import cn.bssys.po.BsTopicExample;
import cn.bssys.po.FrontQueryResult;
import cn.bssys.po.Page;
import cn.bssys.vo.VoTopic;

import java.util.List;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public interface TopicService {
    public List<VoTopic> getList(Page page, Integer year);
    public int add(VoTopic topic);
    public int update(VoTopic voTopic);
    public void delete(Integer id);
    public List<FrontQueryResult> getResearch(Integer year, Page page);
    public Long getTotal();
    public VoTopic selectByPrimaryKey(Integer id);
    public List<BsTopic>  selectByExample(BsTopicExample bsTopicExample);
    public Long countByExample(BsTopicExample bsTopicExample);
}
