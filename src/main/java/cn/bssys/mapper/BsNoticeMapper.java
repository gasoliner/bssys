package cn.bssys.mapper;

import cn.bssys.po.BsNotice;
import cn.bssys.po.BsNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BsNoticeMapper {
    long countByExample(BsNoticeExample example);

    int deleteByExample(BsNoticeExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(BsNotice record);

    int insertSelective(BsNotice record);

    List<BsNotice> selectByExample(BsNoticeExample example);

    BsNotice selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") BsNotice record, @Param("example") BsNoticeExample example);

    int updateByExample(@Param("record") BsNotice record, @Param("example") BsNoticeExample example);

    int updateByPrimaryKeySelective(BsNotice record);

    int updateByPrimaryKey(BsNotice record);
}