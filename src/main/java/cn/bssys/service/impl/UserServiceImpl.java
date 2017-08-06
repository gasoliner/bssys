package cn.bssys.service.impl;

import cn.bssys.mapper.BsTopicMapper;
import cn.bssys.mapper.BsUserMapper;
import cn.bssys.po.*;
import cn.bssys.service.SystemDDLService;
import cn.bssys.service.TopicService;
import cn.bssys.service.UserService;
import cn.bssys.vo.VoUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 万洪基 on 2017/7/5.
 */
@Service("userService")
 public class UserServiceImpl implements UserService {

    public long total;
    @Autowired
    BsUserMapper userMapper;
    @Autowired
    SystemDDLService systemDDLService;
    @Autowired
    TopicService topicService;
    @Override
    public List<VoUser> getList(Page page) {
        return null;
    }

    @Override
    public int add(VoUser voUser) {
        return userMapper.insertSelective(voUser);
    }

    @Override
    public int update(VoUser voUser) {
        return userMapper.updateByPrimaryKeySelective(voUser);
    }

    @Override
    public void delete(Long id) {
        userMapper.deleteByPrimaryKey(id);
        return;
    }
    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public BsUser getUserByEmployenum(String employeenum) {
        BsUserExample userExample = new BsUserExample();
        BsUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andEmployeenumEqualTo(employeenum);
        List<BsUser> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0){
            return userList.get(0);
        }else {
            return null;
        }
    }

    @Override
    public List<FrontQueryResult> topicCount(Page page,int year) {
        PageHelper.startPage(page.getPage(), page.getRows());
        BsUserExample bsUserExample = new BsUserExample();
        List<BsUser> bsUserList = userMapper.selectByExample(bsUserExample);
        PageInfo<BsUser> pageInfo = new PageInfo<>(bsUserList);
        this.total = pageInfo.getTotal();
        List<FrontQueryResult> frontQueryResultList = new ArrayList<>();
        for(BsUser bsUser :
                bsUserList){
            FrontQueryResult frontQueryResult = new FrontQueryResult();
            frontQueryResult.setVar1(systemDDLService.getDDLNameByDDLCode("dep",bsUser.getDeptid()).getDdlname());
            frontQueryResult.setVar2(bsUser.getUsername());
         //根据年度与老师id 创建查询条件，进行查询
            BsTopicExample bsTopicExample = new BsTopicExample();
            BsTopicExample.Criteria criteria = bsTopicExample.createCriteria();
            criteria.andTidEqualTo(bsUser.getUid());
            criteria.andYearEqualTo(year);
            Long count =topicService.countByExample(bsTopicExample);

            frontQueryResult.setVar3(String.valueOf(count));
            frontQueryResultList.add(frontQueryResult);
        }

        return frontQueryResultList;
    }

    @Override
    public VoUser selectByPrimaryKey(Long id) {
        return new VoUser(userMapper.selectByPrimaryKey(id));
    }
}
