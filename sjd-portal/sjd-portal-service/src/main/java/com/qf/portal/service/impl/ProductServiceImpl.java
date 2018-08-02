package com.qf.portal.service.impl;

import com.qf.portal.dao.*;
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
    @Autowired
    private TbUserMapper tbUserMapper;

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
        if (product.getpBrand()!=null && !product.getpBrand().equals("全部")){
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
        if (product.getpRam()!=null && !product.getpRam().equals("全部")){
            criteria.andPRamEqualTo(product.getpRam());
        }
        if (product.getpRom()!=null && !product.getpRom().equals("全部")){
            criteria.andPRomEqualTo(product.getpRom());
        }
        if (product.getpScreenSize()!=null && !product.getpScreenSize().equals("全部")){
            criteria.andPScreenSizeEqualTo(product.getpScreenSize());
        }
        if (product.getPaixu()!=null && product.getPaixu().equals("上架时间")){
            tbProductExample.setOrderByClause("p_upload_time DESC");
        }
        if (product.getPaixu()!=null && product.getPaixu().equals("销量")){
            tbProductExample.setOrderByClause("p_sales DESC");
        }
        if (product.getPaixu()!=null && product.getPaixu().equals("价格")){
            tbProductExample.setOrderByClause("p_price ASC");
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
        List<TbEvaluate> tbEvaluates = tbEvaluateMapper.selectByExampleWithBLOBs(tbEvaluateExample);
        for (TbEvaluate t:tbEvaluates
             ) {
            t.setUname(tbUserMapper.selectByPrimaryKey(t.getUid()).getUname());
            t.setUhead(tbUserMapper.selectByPrimaryKey(t.getUid()).getUhead());
        }
        return tbEvaluates;
    }

    @Override
    public TbProduct showOne(Integer pid) {
        return tbProductMapper.selectByPrimaryKey(pid);
    }
}
