package com.springboot.mybatis.springbootmybatis.service;

import com.springboot.mybatis.springbootmybatis.bean.Demo;
import com.springboot.mybatis.springbootmybatis.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author gaoyun
 * 2018/4/11 9:45
 * 描述:
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name) {
        return demoMapper.likeName(name);
    }

    public Demo getById(long id) {
        return demoMapper.getById(id);
    }

    public String getNameById(long id) {
        return demoMapper.getNameById(id);
    }

    @Transactional
    public void save(Demo demo) {
        demoMapper.save(demo);
    }
}
