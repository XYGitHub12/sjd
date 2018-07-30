package com.qf.manager.web;

import com.qf.manager.pojo.dto.OrderQuery;
import com.qf.manager.pojo.dto.OrderResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.vo.Orders;
import com.qf.manager.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin/orders")
public class OrdersAction {

    @Autowired
    private OrdersService ordersService;

    /**
     * 组合搜索与分页展示
     * @param pageParam
     * @param orderQuery
     * @return result
     */
    @RequestMapping(value = "/getOrders",method = RequestMethod.GET)
    @ResponseBody
    public OrderResult<Orders> queryOrders(PageParam pageParam,OrderQuery orderQuery){

        System.out.println("page:"+pageParam.getPage()+"===="+"limit:"+pageParam.getLimit()+"===="+"startTime:"+orderQuery.getStartTime()+"===="+
                "endTime:"+orderQuery.getEndTime()+"===="+"oid:"+orderQuery.getOid()+"===="+"payment:"+orderQuery.getState());
        OrderResult<Orders> result = null;
        try {
            result = ordersService.selectOrderListByPage(pageParam,orderQuery);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量删除多个订单
     * @param ids
     * @return data
     */
    @RequestMapping(value = "/batch",method = RequestMethod.POST)
    @ResponseBody
    public int searchOrders(@RequestParam("ids[]") List<Integer> ids){

        System.out.println("controller层======oid==============="+ids.get(0)+"=========");
        int data = 0;
        try {
            data = ordersService.deleteOrders(ids);
        }catch (Exception e){
            e.printStackTrace();
        }
        return data;
    }

    /**
     * 删除一个订单
     * @param oid
     * @return result
     */
    @RequestMapping(value = "/deleteOrder",method = RequestMethod.GET)
    public String deleteOrder(Integer oid){

        System.out.println("删除的oid=============="+oid);
        int result = 0;
        try {
            result = ordersService.deleteOrderByOid(oid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "orders";
    }

    /**
     * 查询订单详细信息
     * @param oid
     * @param model
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String selectOrderInfo(Integer oid, Model model){

        Orders orderInfo = null;
        try {
            orderInfo = ordersService.selectOrderByOid(oid);
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("orderInfo",orderInfo);
        return "orderInfo";
    }
}
