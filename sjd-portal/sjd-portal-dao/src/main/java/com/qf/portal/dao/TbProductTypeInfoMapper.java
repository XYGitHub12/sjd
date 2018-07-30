package com.qf.portal.dao;

import com.qf.portal.pojo.po.TbProductTypeInfo;
import com.qf.portal.pojo.po.TbProductTypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductTypeInfoMapper {
    int countByExample(TbProductTypeInfoExample example);

    int deleteByExample(TbProductTypeInfoExample example);

    int deleteByPrimaryKey(Integer typeInfoId);

    int insert(TbProductTypeInfo record);

    int insertSelective(TbProductTypeInfo record);

    List<TbProductTypeInfo> selectByExample(TbProductTypeInfoExample example);

    TbProductTypeInfo selectByPrimaryKey(Integer typeInfoId);

    int updateByExampleSelective(@Param("record") TbProductTypeInfo record, @Param("example") TbProductTypeInfoExample example);

    int updateByExample(@Param("record") TbProductTypeInfo record, @Param("example") TbProductTypeInfoExample example);

    int updateByPrimaryKeySelective(TbProductTypeInfo record);

    int updateByPrimaryKey(TbProductTypeInfo record);
}