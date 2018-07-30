package com.qf.manager.service;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbUser;

import java.util.List;

public interface UserService {
    ItemResult<TbUser> getUser(PageParam pageParam, ItemQuery itemQuery);

    TbUser getUserByUid(Integer uid);

    void editUser(TbUser user);

    void deleteUserByUid(Integer uid);

    int removeUsers(List<Integer> uids);
}
