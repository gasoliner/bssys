package cn.bssys.service.impl;

import cn.bssys.mapper.BsSystemddlMapper;
import cn.bssys.po.BsSystemddl;
import cn.bssys.po.BsSystemddlExample;
import cn.bssys.service.SystemDDLService;
import cn.bssys.vo.VoSystemDDL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Created by 万洪基 on 2017/6/26.
 */
@Service("systemDDLService")
public class SystemDDLServiceImpl implements SystemDDLService {

    @Autowired
    BsSystemddlMapper systemddlMapper;

    public List<BsSystemddl> getKeyword() {
        return systemddlMapper.getDDLKeyword();
    }

    public List<BsSystemddl> getListByKeyword(String keyword) {
        BsSystemddlExample systemddlExample = new BsSystemddlExample();
        BsSystemddlExample.Criteria criteria = systemddlExample.createCriteria();
        criteria.andKeywordEqualTo(keyword);
        List<BsSystemddl> bsSystemddlList = systemddlMapper.selectByExample(systemddlExample);
        return bsSystemddlList;
    }

    @Override
    public int add(VoSystemDDL systemDDL) {
        List<BsSystemddl> systemddlList = getListByKeyword(systemDDL.getKeyword());
        Collections.sort(systemddlList);
        systemDDL.setUuid(UUID.randomUUID().toString());
        systemDDL.setDdlcode(systemddlList.get(systemddlList.size()-1).getDdlcode()+1);
        return systemddlMapper.insertSelective(systemDDL);
    }

    @Override
    public int update(VoSystemDDL voSystemDDL) {
        return systemddlMapper.updateByPrimaryKeySelective(voSystemDDL);
    }

    @Override
    public void delete(String uuid) {
        systemddlMapper.deleteByPrimaryKey(uuid);
        return;
    }

    @Override
    public BsSystemddl getDDLNameByDDLCode(String keyword, Integer DDLCode) {
        BsSystemddlExample systemddlExample = new BsSystemddlExample();
        BsSystemddlExample.Criteria criteria = systemddlExample.createCriteria();
        criteria.andKeywordEqualTo(keyword);
        criteria.andDdlcodeEqualTo(DDLCode);
        List<BsSystemddl> systemddlList = systemddlMapper.selectByExample(systemddlExample);
        if (systemddlList != null && systemddlList.size() >= 1){
            return systemddlList.get(0);
        }else {
            return null;
        }
    }
}
