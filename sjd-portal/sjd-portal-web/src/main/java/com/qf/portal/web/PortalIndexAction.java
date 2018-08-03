package com.qf.portal.web;

import com.qf.common.util.PropKit;
import com.qf.portal.pojo.po.TbContent;
import com.qf.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PortalIndexAction {
    @Autowired
    private ContentService contentService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpServletRequest request){
        Long cid = PropKit.use("index.properties").getLong("lubo.cid");
        List<TbContent> list = contentService.getContentListByCid(cid);
        request.setAttribute("contentList",list);
        return "index";
    }
}
