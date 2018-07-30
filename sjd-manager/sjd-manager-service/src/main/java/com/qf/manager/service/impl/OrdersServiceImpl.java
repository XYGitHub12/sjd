package com.qf.manager.service.impl;

import com.qf.manager.dao.OrdersMapper;
import com.qf.manager.dao.TbOrderMapper;
import com.qf.manager.pojo.dto.OrderQuery;
import com.qf.manager.pojo.dto.OrderResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbOrder;
import com.qf.manager.pojo.po.TbOrderExample;
import com.qf.manager.pojo.vo.Orders;
import com.qf.manager.service.OrdersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private TbOrderMapper tbOrderMapper;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 组合搜索与订单分页显示
     * @param pageParam
     * @param orderQuery
     * @return
     */
    @Override
    public OrderResult<Orders> selectOrderListByPage(PageParam pageParam, OrderQuery orderQuery) {

        OrderResult<Orders> result = new OrderResult<>();
        result.setCode(0);
        result.setMsg("select success");
        try {
            long count = ordersMapper.queryCount(orderQuery);
            System.out.println("count=========："+count);
            result.setCount(count);
            List<Orders> data = ordersMapper.listOrderByPage(pageParam,orderQuery);
            result.setData(data);
        }catch (Exception e){
            result.setCode(-1);
            result.setMsg("select failed");
            e.printStackTrace();
            logger.error(e.getMessage(),e);
        }
        return result;
    }

    /**
     * 批量删除订单
     * @param ids
     * @return
     */
    @Override
    public int deleteOrders(List<Integer> ids) {

        int data = 0;
        try {
            TbOrder tbOrder = new TbOrder();
            tbOrder.setStatus(0);
            TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
            criteria.andOidIn(ids);
            data = tbOrderMapper.updateByExampleSelective(tbOrder, example);
            System.out.println("删除结果=========返回数据data========"+data);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return data;
    }

    /**
     * 删除单个订单
     * @param oid
     * @return
     */
    @Override
    public int deleteOrderByOid(Integer oid) {

        int result = 0;
        try {
            System.out.println("===================删除前:"+oid+"=====================");
            result = ordersMapper.deleteOrderByOid(oid);
            System.out.println("===================删除后=====================");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 查询订单信息
     * @param oid
     * @return
     */
    @Override
    public Orders selectOrderByOid(Integer oid) {

        Orders orderInfo = null;
        try {
            System.out.println("=================执行前："+oid+"============");
            orderInfo = ordersMapper.selectOrderByOid(oid);
            System.out.println("=================执行后："+ orderInfo.getP_name()+"============");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return orderInfo;
    }
}
