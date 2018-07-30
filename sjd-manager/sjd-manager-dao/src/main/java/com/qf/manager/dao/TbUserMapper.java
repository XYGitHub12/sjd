package com.qf.manager.dao;


import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
   int userCount(@Param("itemQuery")ItemQuery itemQuery);
   List<TbUser> getUser(@Param("pageParam")PageParam pageParam, @Param("itemQuery")ItemQuery itemQuery);

    TbUser getUserByUid(@Param("uid") Integer uid);



    void updateUser(TbUser user);

    void deleteUserByUid(@Param("uid") Integer uid);
}