package com.lixuemin.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * demo service a
 **/

@Service
public class AService {
    @Autowired
    private BService _bService;

    public String hello(){
        return "hello, i am the A.";
    }
}
