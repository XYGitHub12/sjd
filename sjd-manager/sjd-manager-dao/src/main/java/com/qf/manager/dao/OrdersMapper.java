package com.qf.manager.dao;

import com.qf.manager.pojo.dto.OrderQuery;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.vo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    long queryCount(@Param("orderQuery") OrderQuery orderQuery);

    List<Orders> listOrderByPage(@Param("pageParam") PageParam pageParam,@Param("orderQuery") OrderQuery orderQuery);

    Orders selectOrderByOid(Integer oid);

    int deleteOrderByOid(Integer oid);
}
