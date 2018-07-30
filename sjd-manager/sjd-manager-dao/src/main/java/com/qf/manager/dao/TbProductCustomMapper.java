package com.qf.manager.dao;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbProductCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProductCustomMapper {
    long countProducts(@Param("itemQuery") ItemQuery itemQuery);


    List<TbProductCustom> listProductsByPage(@Param("pageParam")PageParam pageParam,@Param("itemQuery") ItemQuery itemQuery);
}
