package cn.bssys.mapper;

import cn.bssys.po.BsResource;
import cn.bssys.po.BsResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsResourceMapper {
    long countByExample(BsResourceExample example);

    int deleteByExample(BsResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BsResource record);

    int insertSelective(BsResource record);

    List<BsResource> selectByExample(BsResourceExample example);

    BsResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BsResource record, @Param("example") BsResourceExample example);

    int updateByExample(@Param("record") BsResource record, @Param("example") BsResourceExample example);

    int updateByPrimaryKeySelective(BsResource record);

    int updateByPrimaryKey(BsResource record);
}