package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbProductType;
import com.qf.manager.pojo.po.TbProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductTypeMapper {
    int countByExample(TbProductTypeExample example);

    int deleteByExample(TbProductTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(TbProductType record);

    int insertSelective(TbProductType record);

    List<TbProductType> selectByExample(TbProductTypeExample example);

    TbProductType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") TbProductType record, @Param("example") TbProductTypeExample example);

    int updateByExample(@Param("record") TbProductType record, @Param("example") TbProductTypeExample example);

    int updateByPrimaryKeySelective(TbProductType record);

    int updateByPrimaryKey(TbProductType record);
}