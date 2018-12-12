package com.hxxzt.springbootorache.controller;

import com.hxxzt.springbootorache.entity.Test;
import com.hxxzt.springbootorache.service.ITestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class Controller {

    @Resource
    private ITestService testService;

    @RequestMapping("/test")
    public List<Test> test(){
        return testService.SelectAll();
    }
}