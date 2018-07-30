package com.qf.manager.service.impl;

import com.qf.manager.dao.TbProductTypeMapper;
import com.qf.manager.pojo.po.TbProductType;
import com.qf.manager.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements ProductTypeService{

    @Autowired
    private TbProductTypeMapper tbProductTypeMapper;

    @Override
    public List<TbProductType> queryType() {
        return tbProductTypeMapper.selectByExample(null);
    }
}
