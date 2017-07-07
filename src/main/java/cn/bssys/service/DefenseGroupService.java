package cn.bssys.service;

import cn.bssys.po.Page;
import cn.bssys.vo.VodefenseGroup;

import java.util.List;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public interface DefenseGroupService {
    public List<VodefenseGroup> getList(Page page);
    public int add(VodefenseGroup vodefenseGroup);
    public int update(VodefenseGroup vodefenseGroup);
    public void delete(Integer id);
}
