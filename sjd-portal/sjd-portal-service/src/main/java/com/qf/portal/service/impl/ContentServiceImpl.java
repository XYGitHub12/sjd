package com.qf.portal.service.impl;

import com.qf.common.jedis.JedisClient;
import com.qf.common.util.JsonUtils;
import com.qf.common.util.StrKit;
import com.qf.portal.dao.TbContentMapper;
import com.qf.portal.pojo.po.TbContent;
import com.qf.portal.pojo.po.TbContentExample;
import com.qf.portal.service.ContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentServiceImpl implements ContentService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbContentMapper contentDao;
    @Autowired
    private JedisClient jedisClient;
    @Override
    public List<TbContent> getContentListByCid(Long cid) {
        //1.去缓存里面查询，在try中的内容不能影响本方法的主要功能，主要功能：查询
        try {
            String json = jedisClient.hget("CONTENTLIST", cid + "");
            if(StrKit.notBlank(json)){
                List<TbContent> tbContents = JsonUtils.jsonToList(json, TbContent.class);
                return tbContents;
            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        //2.去数据库里面查询
        TbContentExample example = new TbContentExample();
        TbContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(cid);
        List<TbContent> tbContents = contentDao.selectByExample(example);
        //3.放入缓存中
        try {
            jedisClient.hset("CONTENTLIST",cid+"", JsonUtils.objectToJson(tbContents));
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return tbContents;
    }
}
