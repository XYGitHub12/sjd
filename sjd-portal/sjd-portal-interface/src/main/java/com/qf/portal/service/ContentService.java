package com.qf.portal.service;

import com.qf.portal.pojo.po.TbContent;

import java.util.List;

public interface ContentService {


    /*通过分类进行内容查询*/

    List<TbContent> getContentListByCid(Long cid);
}
