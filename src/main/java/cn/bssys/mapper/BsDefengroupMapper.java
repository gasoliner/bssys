package cn.bssys.mapper;

import cn.bssys.po.BsDefengroup;
import cn.bssys.po.BsDefengroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsDefengroupMapper {
    long countByExample(BsDefengroupExample example);

    int deleteByExample(BsDefengroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BsDefengroup record);

    int insertSelective(BsDefengroup record);

    List<BsDefengroup> selectByExample(BsDefengroupExample example);

    BsDefengroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BsDefengroup record, @Param("example") BsDefengroupExample example);

    int updateByExample(@Param("record") BsDefengroup record, @Param("example") BsDefengroupExample example);

    int updateByPrimaryKeySelective(BsDefengroup record);

    int updateByPrimaryKey(BsDefengroup record);
}