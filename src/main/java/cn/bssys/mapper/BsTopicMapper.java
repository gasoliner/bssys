package cn.bssys.mapper;

import cn.bssys.po.BsTopic;
import cn.bssys.po.BsTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsTopicMapper {
    long countByExample(BsTopicExample example);

    int deleteByExample(BsTopicExample example);

    int deleteByPrimaryKey(Integer toid);

    int insert(BsTopic record);

    int insertSelective(BsTopic record);

    List<BsTopic> selectByExample(BsTopicExample example);

    BsTopic selectByPrimaryKey(Integer toid);

    int updateByExampleSelective(@Param("record") BsTopic record, @Param("example") BsTopicExample example);

    int updateByExample(@Param("record") BsTopic record, @Param("example") BsTopicExample example);

    int updateByPrimaryKeySelective(BsTopic record);

    int updateByPrimaryKey(BsTopic record);

    String selectTopNameByTid(Integer toid);
}