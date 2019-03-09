package com.kaixin.eshop.product.ha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: ${description}
 * @author: weikailong on 2019-03-09 23:58
 **/
@Controller
public class UserController {
    
    @RequestMapping
    @ResponseBody
    public String Hello(String name){
        return "hello " + name;
    }


}
