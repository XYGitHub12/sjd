package com.qf.manager.web;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbProduct;
import com.qf.manager.pojo.po.TbProductCustom;
import com.qf.manager.pojo.po.TbProductType;
import com.qf.manager.service.ProductService;
import com.qf.manager.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class AdminProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    //ajax显示商品列表并分页
    @ResponseBody
    @RequestMapping("/admin/product/listProducts")
    public ItemResult<TbProductCustom> listProducts(PageParam pageParam, ItemQuery itemQuery){
        ItemResult<TbProductCustom> result = null;
        try {
            result = productService.listProduct(pageParam,itemQuery);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    //新增商品
    @RequestMapping("/admin/product/addProducts")
    public@ResponseBody int addProducts(TbProduct tbProduct){
        int c = 0;
        c = productService.addProduct(tbProduct);
        return c;
    }

    //编辑商品页面商品信息回显
    @RequestMapping("/admin/product/updateByPid")
    public String selectProductByPid(Integer pid, HttpSession session){
        TbProduct product = productService.getProductByPid(pid);
        List<TbProductType> list = productTypeService.queryType();
        session.setAttribute("product",product);
        session.setAttribute("productType",list);
        return "editProduct";
    }

    //提交编辑商品信息
    @RequestMapping("/admin/product/editProducts")
    public String editProduct(TbProduct tbProduct){
        int c = productService.updateProduct(tbProduct);

        return "/products";
    }

    //根据id删除商品
    @RequestMapping("/admin/product/deleteProductByPid")
    public String removeProduct(Integer pid){
        int c = productService.removeProduct(pid);
        return "/products";
    }

    //批量删除商品
    @RequestMapping(value="/admin/product/removeProducts")
    @ResponseBody
    public int removeProducts(@RequestParam("ids[]") List<Integer> pids){
        int i= productService.removeProducts(pids);
        return i;
    }


    //根据条件模糊查询商品

}
