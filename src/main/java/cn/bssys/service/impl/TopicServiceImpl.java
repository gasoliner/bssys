package cn.bssys.service.impl;

import cn.bssys.mapper.BsTopicMapper;
import cn.bssys.po.BsTopic;
import cn.bssys.po.BsTopicExample;
import cn.bssys.po.Page;
import cn.bssys.service.SystemDDLService;
import cn.bssys.service.TopicService;
import cn.bssys.vo.VoTopic;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 万洪基 on 2017/6/27.
 */
@Service("topicService")
   public class TopicServiceImpl implements TopicService {

    public long total;
    @Autowired
    BsTopicMapper topicMapper;
    @Autowired
    SystemDDLService systemDDLService;

    @Override
    public List<VoTopic> getList(Page page, Integer year) {
//        分页
        PageHelper.startPage(page.getPage(),page.getRows());
//        构造查询条件
        BsTopicExample topicExample = new BsTopicExample();
//        如果按年度查询
        if (year != null && year != -1){
            BsTopicExample.Criteria criteria = topicExample.createCriteria();
            criteria.andYearEqualTo(year);
        }
        List<BsTopic> topicList = topicMapper.selectByExample(topicExample);
//        取分页信息
        PageInfo<BsTopic> pageInfo = new PageInfo<>(topicList);
        this.total = pageInfo.getTotal();
//        对数字表示的字段进行可视化处理
        List<VoTopic> voTopicList = new ArrayList<>();
        for (BsTopic topic:
                topicList){
            voTopicList.add(voProcessing(topic));
        }
        return voTopicList;
    }

    public VoTopic voProcessing(BsTopic topic){
        VoTopic voTopic = new VoTopic();
        voTopic.setToid(topic.getToid());
        voTopic.setName(topic.getName());
        voTopic.setExplaining(topic.getExplaining());
        if (topic.getSrname() != null){
            voTopic.setSrname(topic.getSrname());
        }
        voTopic.setGradlink(topic.getGradlink());
        voTopic.setTestpercent(topic.getTestpercent());
        voTopic.setResearch(topic.getResearch());
        voTopic.setCh(topic.getCh());
        voTopic.setEn(topic.getEn());
        voTopic.setComment(topic.getComment());

//        需要可视化的字段
        voTopic.setVoyear(systemDDLService.getDDLNameByDDLCode("year",topic.getYear()).getDdlname());
        voTopic.setVocollege(systemDDLService.getDDLNameByDDLCode("college",topic.getCollege()).getDdlname());
        voTopic.setVomajor(systemDDLService.getDDLNameByDDLCode("major",topic.getMajor()).getDdlname());
        voTopic.setVocategory(systemDDLService.getDDLNameByDDLCode("category",topic.getCategory()).getDdlname());
        voTopic.setVosrc(systemDDLService.getDDLNameByDDLCode("src",topic.getSrc()).getDdlname());
        voTopic.setVotype(systemDDLService.getDDLNameByDDLCode("type",topic.getType()).getDdlname());
        voTopic.setVocomability(systemDDLService.getDDLNameByDDLCode("comability",topic.getComability()).getDdlname());
        voTopic.setVohandability(systemDDLService.getDDLNameByDDLCode("require",topic.getHandability()).getDdlname());
        voTopic.setVoinnovation(systemDDLService.getDDLNameByDDLCode("require",topic.getInnovation()).getDdlname());
        voTopic.setVototal(systemDDLService.getDDLNameByDDLCode("degree",topic.getTotal()).getDdlname());
        voTopic.setVodifficulty(systemDDLService.getDDLNameByDDLCode("degree",topic.getDifficulty()).getDdlname());

        return voTopic;
    }

    @Override
    public int add(VoTopic topic) {
        return topicMapper.insertSelective(topic);
    }

    @Override
    public int update(VoTopic voTopic) {
        return topicMapper.updateByPrimaryKeySelective(voTopic);
    }

    @Override
    public void delete(Integer id) {
        topicMapper.deleteByPrimaryKey(id);
        return;
    }

    @Override
    public BsTopic selectByPrimaryKey(Integer id) {
        return topicMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BsTopic> selectByExample(BsTopicExample bsTopicExample) {
        return topicMapper.selectByExample(bsTopicExample);
    }

    @Override
    public Long countByExample(BsTopicExample bsTopicExample) {
        return topicMapper.countByExample(bsTopicExample);
    }
}
