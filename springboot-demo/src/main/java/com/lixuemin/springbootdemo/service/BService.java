package com.lixuemin.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * demo service a
 **/

@Service
public class BService {
    @Autowired
    private AService _aService;

    public String hello(){
        return "hello, i am the B.";
    }
}
