package com.qf.manager.web;

import com.qf.manager.pojo.po.TbProductType;
import com.qf.manager.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminproductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/admin/queryProductType")
    public String queryProductType(Model model){
        List<TbProductType> list = productTypeService.queryType();
        model.addAttribute("typeList",list);
        return "createProduct";
    }
}
