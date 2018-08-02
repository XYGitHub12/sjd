package com.qf.manager.service.impl;

import com.qf.manager.dao.TbContentMapper;
import com.qf.manager.pojo.po.TbContent;
import com.qf.manager.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerServiceImpl implements BannerService{
    @Autowired
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> queryBanner() {
        List<TbContent> tbContents = tbContentMapper.selectByExample(null);
        return tbContents;
    }

    @Override
    public int updateURL(TbContent tbContent) {
        int c = tbContentMapper.updateByPrimaryKeySelective(tbContent);
        return c;
    }
}
