package com.lixuemin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @program: demo-for-someframework
 * @description:
 * @author: lixuemin
 * @create: 2021-06-21
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/index")
    public String index() {
        return "book-index";
    }

    @RequestMapping("/list")
    public String list() {
        return "book-list";
    }
}
