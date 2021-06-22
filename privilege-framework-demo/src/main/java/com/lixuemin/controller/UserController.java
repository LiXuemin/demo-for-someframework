package com.lixuemin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo-for-someframework
 * @description:
 * @author: lixuemin
 * @create: 2021-06-21
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index() {
        return "user-index";
    }

    @RequestMapping("/list")
    public String list() {
        return "user-list";
    }
}
