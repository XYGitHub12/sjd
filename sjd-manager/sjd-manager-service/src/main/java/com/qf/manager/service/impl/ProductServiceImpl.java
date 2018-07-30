package com.qf.manager.service.impl;

import com.qf.manager.dao.TbProductCustomMapper;
import com.qf.manager.dao.TbProductMapper;
import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbProduct;
import com.qf.manager.pojo.po.TbProductCustom;
import com.qf.manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private TbProductCustomMapper tbProductCustomDao;
    @Autowired
    private TbProductMapper tbProductMapper;

    @Override
    public ItemResult<TbProductCustom> listProduct(PageParam pageParam, ItemQuery itemQuery) {
        ItemResult<TbProductCustom> result = new ItemResult<>();
        result.setCode(0);
        result.setMsg("success");
        long count = tbProductCustomDao.countProducts(itemQuery);
        result.setCount(count);
        List<TbProductCustom> data = tbProductCustomDao.listProductsByPage(pageParam,itemQuery);
//        System.out.print(data);
        result.setData(data);
        return result;
    }

    @Override
    public int addProduct(TbProduct tbProduct){

        tbProduct.setpUploadTime(new Date());
        int c = tbProductMapper.insertSelective(tbProduct);

        return c;
    }

    @Override
    public int updateProduct(TbProduct tbProduct) {
        int c = tbProductMapper.updateByPrimaryKeySelective(tbProduct);
        return c;
    }

    @Override
    public int removeProduct(Integer pid) {
        int c = tbProductMapper.deleteByPrimaryKey(pid);
        return c;
    }

    @Override
    public int removeProducts(List<Integer> pids) {
        try{
            for (Integer pid:pids) {
                tbProductMapper.deleteByPrimaryKey(pid);
            }
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @Override
    public TbProduct getProductByPid(Integer pid) {
        TbProduct product = tbProductMapper.selectByPrimaryKey(pid);

        return product;
    }
}
