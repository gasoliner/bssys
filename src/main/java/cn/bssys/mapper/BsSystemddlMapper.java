package cn.bssys.mapper;

import cn.bssys.po.BsSystemddl;
import cn.bssys.po.BsSystemddlExample;
import java.util.List;

import cn.bssys.vo.VoSystemDDL;
import org.apache.ibatis.annotations.Param;

public interface BsSystemddlMapper {
    long countByExample(BsSystemddlExample example);

    int deleteByExample(BsSystemddlExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(BsSystemddl record);

    int insertSelective(BsSystemddl record);

    List<BsSystemddl> selectByExample(BsSystemddlExample example);

    BsSystemddl selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BsSystemddl record, @Param("example") BsSystemddlExample example);

    int updateByExample(@Param("record") BsSystemddl record, @Param("example") BsSystemddlExample example);

    int updateByPrimaryKeySelective(BsSystemddl record);

    int updateByPrimaryKey(BsSystemddl record);

//    自定义
//    得到所有的DDL keyword
    List<BsSystemddl> getDDLKeyword();
}