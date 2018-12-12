package com.hxxzt.springbootorache.service.impl;

import com.hxxzt.springbootorache.dao.ITestDao;
import com.hxxzt.springbootorache.entity.Test;
import com.hxxzt.springbootorache.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private ITestDao testDao;

    @Override
    public List<Test> SelectAll() {
        return testDao.All();
    }
}