package cn.bssys.service;

import cn.bssys.po.BsNotice;
import cn.bssys.po.BsRole;
import cn.bssys.po.Page;
import cn.bssys.vo.VoNotice;
import cn.bssys.vo.VoRole;

import java.util.List;
import java.util.Set;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public interface RoleService {
    public List<VoRole> getList(Page page);
    public int add(VoRole voRole);
    public int update(VoRole voRole);
    public void delete(String uuid);
    public BsRole getObjectByPrimaryKey(String uuid);
    public Set<String> getPermissionByRid(long rid);
}
