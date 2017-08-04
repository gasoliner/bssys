package cn.bssys.service;

import cn.bssys.po.BsStudent;
import cn.bssys.po.FrontQueryResult;
import cn.bssys.po.Page;
import cn.bssys.vo.VoStudent;

import java.util.List;

/**
 * Created by LENOVO on 2017/8/1.
 */
public interface StudentService {
    public List<VoStudent> getList(Page page);

    public int add(BsStudent bsStudent);

    public int update(BsStudent bsStudent);

    public int delete(int sid);

    public long getTotal();

    public List<VoStudent> getStudentByTid(Integer tid);

    public VoStudent getObjectByPrimaryKey(int id);

    public List<FrontQueryResult> myStudentList(Integer tid);

}
