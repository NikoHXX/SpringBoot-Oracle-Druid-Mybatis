package com.hxxzt.springbootorache.dao;

import com.hxxzt.springbootorache.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ITestDao {
    List<Test> All();
    Test findById(@Param("ID") String ID);
}