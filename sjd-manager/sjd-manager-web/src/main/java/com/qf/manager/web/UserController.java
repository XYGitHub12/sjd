package com.qf.manager.web;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbUser;
import com.qf.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/admin/user/getUsers")
    @ResponseBody
    public ItemResult<TbUser> getAllUser(PageParam pageParam, ItemQuery itemQuery){
        System.out.print(pageParam.getPage()+""+pageParam.getLimit());
        ItemResult<TbUser> itemResult=null;
        try{
            itemResult=userService.getUser(pageParam,itemQuery);
        }catch(Exception e){

        }
        return itemResult;
    }
    @RequestMapping(value="/admin/user/getUserByUid")
    public String getUserByUid(Integer uid, HttpSession session){
       TbUser user= userService.getUserByUid(uid);
       session.setAttribute("user",user);
      return "editUser";
    }
    @RequestMapping(value="/admin/user/editUser")
    public String editUser(TbUser user){
        userService.editUser(user);
        return "/index";
    }
    @RequestMapping(value="/admin/user/deleteUserByUid")
    public String deleteUserByUid(Integer uid){
        userService.deleteUserByUid(uid);
        return "/index";
    }
    @RequestMapping(value="/admin/user/removeUsers")
    @ResponseBody
    public int removeUsers(@RequestParam("ids[]") List<Integer> uids){
       int i= userService.removeUsers(uids);
        return i;
    }
}
