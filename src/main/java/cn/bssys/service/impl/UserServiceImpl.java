package cn.bssys.service.impl;

import cn.bssys.mapper.BsUserMapper;
import cn.bssys.po.BsUser;
import cn.bssys.po.BsUserExample;
import cn.bssys.po.Page;
import cn.bssys.service.SystemDDLService;
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

    private long total;

    public long getTotal() {
        return total;
    }

    @Autowired
    BsUserMapper userMapper;
    @Autowired
    SystemDDLService systemDDLService;

    /***
     * 该方法用于返回voUserList
     * 在项目后期，Vo化部分，如果不是必填字段，需要加if判断是否为空
     * @param page
     * @return
     */
    @Override
    public List<VoUser> getList(Page page) {
        PageHelper.startPage(page.getPage(),page.getRows());
        BsUserExample userExample = new BsUserExample();
        List<BsUser> userList = userMapper.selectByExample(userExample);
        PageInfo<BsUser> pageInfo = new PageInfo<>(userList);
        this.total = pageInfo.getTotal();
//        Vo
        List<VoUser> voUserList = new ArrayList<>();
        for (BsUser user:
                userList){
            VoUser voUser = new VoUser(user);
            voUser.setVoDep(systemDDLService.getDDLNameByDDLCode("dep",user.getDeptid()).getDdlname());
            voUser.setVoSex(systemDDLService.getDDLNameByDDLCode("sex",user.getSex()).getDdlname());
            voUser.setVoMajor(systemDDLService.getDDLNameByDDLCode("major",user.getMajor()).getDdlname());
            voUser.setVoTitle(systemDDLService.getDDLNameByDDLCode("title",user.getTitle()).getDdlname());
            voUserList.add(voUser);
        }
        return voUserList;
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
