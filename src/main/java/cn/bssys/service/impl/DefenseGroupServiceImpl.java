package cn.bssys.service.impl;

import cn.bssys.mapper.BsDefengroupMapper;
import cn.bssys.mapper.BsTopicMapper;
import cn.bssys.po.*;
import cn.bssys.service.DefenseGroupService;
import cn.bssys.service.SystemDDLService;
import cn.bssys.service.TopicService;
import cn.bssys.vo.VoTopic;
import cn.bssys.vo.VodefenseGroup;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 万洪基 on 2017/6/27.
 */
@Service("defenseGroup")
public class DefenseGroupServiceImpl implements DefenseGroupService {

    public long total;
    @Autowired
    BsDefengroupMapper defengroupMapper;

    @Override
    public List<VodefenseGroup> getList(Page page) {
//        分页
        PageHelper.startPage(page.getPage(),page.getRows());
//        构造查询条件
        BsDefengroupExample defengroupExample = new BsDefengroupExample();
//        查询
        List<BsDefengroup> defengroupList = defengroupMapper.selectByExample(defengroupExample);
//        取分页信息
        PageInfo<BsDefengroup> pageInfo = new PageInfo<>(defengroupList);
        this.total = pageInfo.getTotal();
//        Vo化
        List<VodefenseGroup> vodefenseGroupList = new ArrayList<>();
        for (BsDefengroup defengroup:
                defengroupList){
            VodefenseGroup vodefenseGroup = new VodefenseGroup();
            vodefenseGroup.setId(defengroup.getId());
            vodefenseGroup.setGroupid(defengroup.getGroupid());
            vodefenseGroup.setLeader(defengroup.getLeader());
            vodefenseGroup.setMembers(defengroup.getMembers());
            vodefenseGroupList.add(vodefenseGroup);
        }
        return vodefenseGroupList;
    }

    @Override
    public int add(VodefenseGroup vodefenseGroup) {
        return defengroupMapper.insertSelective(vodefenseGroup);
    }

    @Override
    public int update(VodefenseGroup vodefenseGroup) {
        return defengroupMapper.updateByPrimaryKeySelective(vodefenseGroup);
    }

    @Override
    public void delete(Integer id) {
        defengroupMapper.deleteByPrimaryKey(id);
        return;
    }

    @Override
    public VodefenseGroup getObjectByPrimaryKey(Integer dgid) {
        VodefenseGroup vodefenseGroup = new VodefenseGroup(defengroupMapper.selectByPrimaryKey(dgid));
        return vodefenseGroup;
    }
}
