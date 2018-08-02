package com.qf.manager.service;

import com.qf.manager.pojo.po.TbContent;

import java.util.List;

public interface BannerService {
    List<TbContent> queryBanner();

    int updateURL(TbContent tbContent);
}
