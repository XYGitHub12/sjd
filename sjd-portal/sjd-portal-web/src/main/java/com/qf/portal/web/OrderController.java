package com.qf.portal.web;

import com.qf.portal.pojo.po.TbOrder;
import com.qf.portal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService ordreService;

    @RequestMapping("/showAllOrders")
    public String showAllOrders(Model model){

        List<TbOrder> listOrder=null;
        try {
            listOrder = ordreService.showAllOrders();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(listOrder);
        model.addAttribute("listOrder",listOrder);
      return "forward:/orders";
    }


}
