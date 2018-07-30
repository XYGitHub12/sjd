package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbReply;
import com.qf.manager.pojo.po.TbReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReplyMapper {
    int countByExample(TbReplyExample example);

    int deleteByExample(TbReplyExample example);

    int deleteByPrimaryKey(Integer replyid);

    int insert(TbReply record);

    int insertSelective(TbReply record);

    List<TbReply> selectByExample(TbReplyExample example);

    TbReply selectByPrimaryKey(Integer replyid);

    int updateByExampleSelective(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByExample(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByPrimaryKeySelective(TbReply record);

    int updateByPrimaryKey(TbReply record);
}