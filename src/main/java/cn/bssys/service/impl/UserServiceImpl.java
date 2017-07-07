package cn.bssys.service.impl;

import cn.bssys.mapper.BsUserMapper;
import cn.bssys.po.BsUser;
import cn.bssys.po.BsUserExample;
import cn.bssys.po.Page;
import cn.bssys.service.UserService;
import cn.bssys.vo.VoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 万洪基 on 2017/7/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    BsUserMapper userMapper;

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
}
