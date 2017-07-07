package cn.bssys.service.impl;

import cn.bssys.mapper.BsNoticeMapper;
import cn.bssys.mapper.BsResourceMapper;
import cn.bssys.mapper.BsRoleMapper;
import cn.bssys.po.*;
import cn.bssys.service.NoticeService;
import cn.bssys.service.RoleService;
import cn.bssys.service.SystemDDLService;
import cn.bssys.vo.VoNotice;
import cn.bssys.vo.VoRole;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by 万洪基 on 2017/6/27.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    public long total;
    @Autowired
    BsRoleMapper roleMapper;
    @Autowired
    BsResourceMapper resourceMapper;

    @Override
    public List<VoRole> getList(Page page) {
        return null;
    }

    @Override
    public int add(VoRole voRole) {
        return 0;
    }

    @Override
    public int update(VoRole voRole) {
        return 0;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public BsRole getObjectByPrimaryKey(String uuid) {
        return null;
    }

    @Override
    public Set<String> getPermissionByRid(long rid) {
//        根据rid查询角色
        BsRole role = roleMapper.selectByPrimaryKey(rid);
//        获取role的ResourceIds
        String resource = role.getResourceIds();
//        切割
        String permission [] = resource.split(",");
//        遍历permission数组，并添加到List<Long>中
        List<Long> permissionList = new ArrayList<>();
        for (String string:
                permission){
            permissionList.add(Long.parseLong(string));
        }
//        根据List<Long>查resource表，用的是andIdIn()方法
        BsResourceExample resourceExample = new BsResourceExample();
        BsResourceExample.Criteria criteria = resourceExample.createCriteria();
        criteria.andIdIn(permissionList);
        List<BsResource> resourceList = resourceMapper.selectByExample(resourceExample);
//        遍历resource把list 转为set
        Set<String> stringSet = new TreeSet<>();
        for (BsResource tempResource:
                resourceList){
            stringSet.add(tempResource.getPermission());
        }
        System.out.println("resourceList:\t"+resourceList);
        return stringSet;
    }
}
