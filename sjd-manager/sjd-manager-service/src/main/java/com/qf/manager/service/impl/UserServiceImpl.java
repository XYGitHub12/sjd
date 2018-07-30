package com.qf.manager.service.impl;

import com.qf.manager.dao.TbUserMapper;
import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbUser;
import com.qf.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private TbUserMapper tbUserMapper;
    @Override
    public ItemResult<TbUser> getUser(PageParam pageParam, ItemQuery itemQuery) {
        ItemResult<TbUser> itemResult=new ItemResult<>();
        itemResult.setCode(0);
        itemResult.setMsg("yes");
        try{
            itemResult.setCount(tbUserMapper.userCount(itemQuery));
            itemResult.setData(tbUserMapper.getUser(pageParam,itemQuery));
        }catch(Exception e){
            itemResult.setCode(1);
            itemResult.setMsg("no");
        }
        return itemResult;
    }

    @Override
    public TbUser getUserByUid(Integer uid) {
        return tbUserMapper.getUserByUid(uid);
    }

    @Override
    public void editUser(TbUser user) {
        tbUserMapper.updateUser(user);
    }

    @Override
    public void deleteUserByUid(Integer uid) {
        tbUserMapper.deleteUserByUid(uid);
    }

    @Override
    public int removeUsers(List<Integer> uids) {
       try{
           for (Integer uid:uids) {
               tbUserMapper.deleteUserByUid(uid);
           }
       }catch (Exception e){
           return 0;
       }
        return 1;
    }
}
