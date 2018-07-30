package com.qf.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: DHC
 * Date: 2018/7/17
 * Time: 15:36
 * Version:V1.0
 */
@Controller
public class NavigationController {

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String one(@PathVariable String page) {
        return page;
    }

    @RequestMapping(value = "/pages/{pageName1}", method = RequestMethod.GET)
    public String two(@PathVariable String pageName1) {
        return "pages/" + pageName1;
    }

    @RequestMapping(value = "/pages/{pageName1}/{pageName2}", method = RequestMethod.GET)
    public String three(@PathVariable String pageName1, @PathVariable String pageName2) {
        return "pages/" + pageName1 + "/" + pageName2;
    }


}
