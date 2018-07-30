package com.qf.manager.service;

import com.qf.manager.pojo.dto.OrderQuery;
import com.qf.manager.pojo.dto.OrderResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.vo.Orders;

import java.util.List;

public interface OrdersService {

    OrderResult<Orders> selectOrderListByPage(PageParam page, OrderQuery orderQuery);

    int deleteOrders(List<Integer> ids);

    int deleteOrderByOid(Integer oid);

    Orders selectOrderByOid(Integer oid);
}
