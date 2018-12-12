package com.hxxzt.springbootorache.service;

import com.hxxzt.springbootorache.entity.Test;

import java.util.List;

public interface ITestService {
    List<Test> SelectAll();
}