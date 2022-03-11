package com.lixuemin.springbootdemo;

import com.lixuemin.springbootdemo.service.AService;
import com.lixuemin.springbootdemo.service.BService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootDemoApplication {
    @Autowired
    private AService _aService;
    @Autowired
    private BService _bService;

    @PostConstruct
    public void init(){
        System.out.println(_aService.hello());
        System.out.println(_bService.hello());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
}
