package com.qf.portal.web;

import com.qf.portal.pojo.dto.SearchProduct;
import com.qf.portal.pojo.po.TbEvaluate;
import com.qf.portal.pojo.po.TbProduct;
import com.qf.portal.pojo.po.TbProductType;
import com.qf.portal.pojo.po.TbProductTypeInfo;
import com.qf.portal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService ps;

    @RequestMapping("/showAll")
    @ResponseBody
    public List<TbProduct> run1(){
        List<TbProduct> products = ps.showAll();
        return products;
    }

    @RequestMapping("/showOne")
    public String run1(Integer pid, Model model){
        TbProduct product = ps.showOne(pid);
        List<TbEvaluate> tbEvaluates = ps.proevaluate(pid);
        System.out.println(tbEvaluates.get(0).getContent());
        System.out.println(tbEvaluates.get(0).getEvaluateid());
        model.addAttribute("product", product);
        model.addAttribute("tbEvaluates", tbEvaluates);
        return "forward:/productInfo";
    }

    @RequestMapping("/search")
    @ResponseBody
    public List<TbProduct> run2(SearchProduct product){
        List<TbProduct> products = ps.search(product);
        return products;
    }

    @RequestMapping("/protype")
    @ResponseBody
    public List<TbProductType> run3(){
        List<TbProductType> productTypes = ps.protype();
        return productTypes;
    }

    @RequestMapping("/protypeinfo")
    @ResponseBody
    public List<TbProductTypeInfo> run4(){
        List<TbProductTypeInfo> productTypeInfos = ps.protypeinfo();
        return productTypeInfos;
    }

    @RequestMapping("/protypeinfoByid")
    @ResponseBody
    public List<TbProductTypeInfo> run5(Integer typeId){
        List<TbProductTypeInfo> productTypeInfos = ps.protypeinfoByid(typeId);
        return productTypeInfos;
    }

    @RequestMapping("/proevaluate")
    @ResponseBody
    public List<TbEvaluate> run6(Integer pid){
        List<TbEvaluate> tbEvaluates = ps.proevaluate(pid);
        return tbEvaluates;
    }

}
