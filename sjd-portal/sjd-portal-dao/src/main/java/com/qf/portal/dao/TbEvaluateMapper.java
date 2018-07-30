package com.qf.portal.dao;

import com.qf.portal.pojo.po.TbEvaluate;
import com.qf.portal.pojo.po.TbEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEvaluateMapper {
    int countByExample(TbEvaluateExample example);

    int deleteByExample(TbEvaluateExample example);

    int deleteByPrimaryKey(Integer evaluateid);

    int insert(TbEvaluate record);

    int insertSelective(TbEvaluate record);

    List<TbEvaluate> selectByExampleWithBLOBs(TbEvaluateExample example);

    List<TbEvaluate> selectByExample(TbEvaluateExample example);

    TbEvaluate selectByPrimaryKey(Integer evaluateid);

    int updateByExampleSelective(@Param("record") TbEvaluate record, @Param("example") TbEvaluateExample example);

    int updateByExampleWithBLOBs(@Param("record") TbEvaluate record, @Param("example") TbEvaluateExample example);

    int updateByExample(@Param("record") TbEvaluate record, @Param("example") TbEvaluateExample example);

    int updateByPrimaryKeySelective(TbEvaluate record);

    int updateByPrimaryKeyWithBLOBs(TbEvaluate record);

    int updateByPrimaryKey(TbEvaluate record);
}