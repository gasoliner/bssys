package cn.bssys.service;

import cn.bssys.po.BsSystemddl;
import cn.bssys.vo.VoSystemDDL;

import java.util.List;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public interface SystemDDLService {

    public List<BsSystemddl> getKeyword();

    public List<BsSystemddl> getListByKeyword(String keyword);

    public int add(VoSystemDDL systemDDL);

    public int update(VoSystemDDL voSystemDDL);

    public void delete(String uuid);

    public BsSystemddl getDDLNameByDDLCode(String keyword,Integer DDLCode);
}
