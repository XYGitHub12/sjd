package com.qf.portal.service;

import com.qf.portal.pojo.dto.SearchProduct;
import com.qf.portal.pojo.po.TbEvaluate;
import com.qf.portal.pojo.po.TbProduct;
import com.qf.portal.pojo.po.TbProductType;
import com.qf.portal.pojo.po.TbProductTypeInfo;

import java.util.List;

public interface ProductService {
    List<TbProduct> showAll();

    List<TbProduct> search(SearchProduct product);

    List<TbProductType> protype();

    List<TbProductTypeInfo> protypeinfo();

    List<TbProductTypeInfo> protypeinfoByid(Integer typeId);

    List<TbEvaluate> proevaluate(Integer pid);

    TbProduct showOne(Integer pid);
}
