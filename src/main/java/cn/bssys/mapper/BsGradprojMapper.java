package cn.bssys.mapper;

import cn.bssys.po.BsGradproj;
import cn.bssys.po.BsGradprojExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsGradprojMapper {
    long countByExample(BsGradprojExample example);

    int deleteByExample(BsGradprojExample example);

    int deleteByPrimaryKey(Integer bsid);

    int insert(BsGradproj record);

    int insertSelective(BsGradproj record);

    List<BsGradproj> selectByExample(BsGradprojExample example);

    BsGradproj selectByPrimaryKey(Integer bsid);

    int updateByExampleSelective(@Param("record") BsGradproj record, @Param("example") BsGradprojExample example);

    int updateByExample(@Param("record") BsGradproj record, @Param("example") BsGradprojExample example);

    int updateByPrimaryKeySelective(BsGradproj record);

    int updateByPrimaryKey(BsGradproj record);
}