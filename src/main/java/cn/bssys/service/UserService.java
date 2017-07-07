package cn.bssys.service;

import cn.bssys.po.BsUser;
import cn.bssys.po.Page;
import cn.bssys.vo.VoUser;

import java.util.List;
import java.util.Set;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public interface UserService {
    public List<VoUser> getList(Page page);
    public int add(VoUser voUser);
    public int update(VoUser voUser);
    public void delete(Long id);
    public BsUser getUserByEmployenum(String employeenum);

}
