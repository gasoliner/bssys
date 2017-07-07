package cn.bssys.mapper;

import cn.bssys.po.BsRole;
import cn.bssys.po.BsRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsRoleMapper {
    long countByExample(BsRoleExample example);

    int deleteByExample(BsRoleExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(BsRole record);

    int insertSelective(BsRole record);

    List<BsRole> selectByExample(BsRoleExample example);

    BsRole selectByPrimaryKey(Long rid);

    int updateByExampleSelective(@Param("record") BsRole record, @Param("example") BsRoleExample example);

    int updateByExample(@Param("record") BsRole record, @Param("example") BsRoleExample example);

    int updateByPrimaryKeySelective(BsRole record);

    int updateByPrimaryKey(BsRole record);
}