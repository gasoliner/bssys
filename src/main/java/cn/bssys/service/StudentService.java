package cn.bssys.service;

import cn.bssys.po.BsStudent;
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

    List<VoStudent> getStudentByTid(Integer tid);
}