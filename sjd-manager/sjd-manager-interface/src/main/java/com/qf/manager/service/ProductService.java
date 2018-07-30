package com.qf.manager.service;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbProduct;
import com.qf.manager.pojo.po.TbProductCustom;

import java.util.List;
public interface ProductService {
    ItemResult<TbProductCustom> listProduct(PageParam pageParam, ItemQuery itemQuery);


    int addProduct(TbProduct tbProduct);

    TbProduct getProductByPid(Integer pid);

    int updateProduct(TbProduct tbProduct);

    int removeProduct(Integer pid);

    int removeProducts(List<Integer> pids);
}
