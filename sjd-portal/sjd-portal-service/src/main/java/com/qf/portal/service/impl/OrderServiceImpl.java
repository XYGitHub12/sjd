package com.qf.portal.service.impl;

import com.qf.portal.dao.TbOrderMapper;
import com.qf.portal.dao.TbUserMapper;
import com.qf.portal.pojo.po.TbOrder;
import com.qf.portal.pojo.po.TbUser;
import com.qf.portal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private TbOrderMapper orderDao;
    @Autowired
    private TbUserMapper userDao;

    @Override
    public List<TbOrder> showAllOrders() {
        List<TbOrder> tbOrders = orderDao.showAllOrders();
        for (TbOrder tbOrder : tbOrders) {
           TbUser tbUser=userDao.selectByPrimaryKey(tbOrder.getUid());
           tbOrder.setTbUser(tbUser);
        }
        return tbOrders;
    }
}
