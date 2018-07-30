package com.qf.portal.service.impl;

import com.qf.portal.dao.TbEvaluateMapper;
import com.qf.portal.dao.TbProductMapper;
import com.qf.portal.dao.TbProductTypeInfoMapper;
import com.qf.portal.dao.TbProductTypeMapper;
import com.qf.portal.pojo.dto.SearchProduct;
import com.qf.portal.pojo.po.*;
import com.qf.portal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private TbProductMapper tbProductMapper;
    @Autowired
    private TbProductTypeMapper tbProductTypeMapper;
    @Autowired
    private TbProductTypeInfoMapper tbProductTypeInfoMapper;
    @Autowired
    private TbEvaluateMapper tbEvaluateMapper;

    @Override
    public List<TbProduct> showAll() {
        return tbProductMapper.selectByExample(null);
    }

    @Override
    public List<TbProduct> search(SearchProduct product) {
        TbProductExample tbProductExample = new TbProductExample();
        TbProductExample.Criteria criteria = tbProductExample.createCriteria();
        if (product.getpName()!=null){
            criteria.andPNameLike("%"+product.getpName()+"%");
        }
        if (product.getpBrand()!=null){
            criteria.andPBrandEqualTo(product.getpBrand());
        }
        if (product.getMinPrice()>0 && product.getMaxPrice()==0){
            criteria.andPPriceGreaterThan(product.getMinPrice());
        }
        if (product.getMinPrice()==0.0 && product.getMaxPrice()>0.0){
            criteria.andPPriceLessThan(product.getMaxPrice());
        }
        if (product.getMinPrice()>0.0 && product.getMaxPrice()>0.0){
            criteria.andPPriceBetween(product.getMinPrice(),product.getMaxPrice());
        }
        if (product.getpRam()!=null){
            criteria.andPRamEqualTo(product.getpRam());
        }
        if (product.getpRom()!=null){
            criteria.andPRomEqualTo(product.getpRom());
        }
        if (product.getpScreenSize()!=null){
            criteria.andPScreenSizeEqualTo(product.getpScreenSize());
        }
        if (product.getpUploadTime()!=null){
            tbProductExample.setOrderByClause("p_upload_time DESC");
        }
        if (product.getpSales()!=-1){
            tbProductExample.setOrderByClause("p_sales DESC");
        }
        List<TbProduct> products = tbProductMapper.selectByExample(tbProductExample);
        return products;
    }

    @Override
    public List<TbProductType> protype() {
        return tbProductTypeMapper.selectByExample(null);
    }

    @Override
    public List<TbProductTypeInfo> protypeinfo() {
        return tbProductTypeInfoMapper.selectByExample(null);
    }

    @Override
    public List<TbProductTypeInfo> protypeinfoByid(Integer typeId) {
        TbProductTypeInfoExample tbProductTypeInfoExample = new TbProductTypeInfoExample();
        TbProductTypeInfoExample.Criteria criteria = tbProductTypeInfoExample.createCriteria();
        criteria.andTypeIdEqualTo(typeId);
        return tbProductTypeInfoMapper.selectByExample(tbProductTypeInfoExample);
    }

    @Override
    public List<TbEvaluate> proevaluate(Integer pid) {
        TbEvaluateExample tbEvaluateExample = new TbEvaluateExample();
        TbEvaluateExample.Criteria criteria = tbEvaluateExample.createCriteria();
        criteria.andPidEqualTo(pid);
        return tbEvaluateMapper.selectByExampleWithBLOBs(tbEvaluateExample);
    }

    @Override
    public TbProduct showOne(Integer pid) {
        return tbProductMapper.selectByPrimaryKey(pid);
    }
}
