package cn.bssys.mapper;

import cn.bssys.po.BsStudent;
import cn.bssys.po.BsStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsStudentMapper {
    long countByExample(BsStudentExample example);

    int deleteByExample(BsStudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(BsStudent record);

    int insertSelective(BsStudent record);

    List<BsStudent> selectByExample(BsStudentExample example);

    BsStudent selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") BsStudent record, @Param("example") BsStudentExample example);

    int updateByExample(@Param("record") BsStudent record, @Param("example") BsStudentExample example);

    int updateByPrimaryKeySelective(BsStudent record);

    int updateByPrimaryKey(BsStudent record);
}