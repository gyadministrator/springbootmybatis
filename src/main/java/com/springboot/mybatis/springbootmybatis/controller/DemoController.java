package com.springboot.mybatis.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.mybatis.springbootmybatis.bean.Demo;
import com.springboot.mybatis.springbootmybatis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gaoyun
 * 2018/4/11 9:48
 * 描述:
 */

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/likeName")
    public List<Demo> likeName(@RequestParam("name") String name) {
        PageHelper.startPage(1, 3);
        List<Demo> list = demoService.likeName(name);
        PageInfo<Demo> pageInfo = new PageInfo<>(list, 6);
        return pageInfo.getList();
    }

    @GetMapping("/getById/{id}")
    public Demo getById(@PathVariable("id") long id) {
        return demoService.getById(id);
    }

    @GetMapping("/getNameById/{id}")
    public String getNameById(@PathVariable("id") long id) {
        return demoService.getNameById(id);
    }

    @GetMapping("/save")
    public Demo save() {
        Demo demo = new Demo();
        demo.setName("测试");
        demoService.save(demo);
        return demo;
    }
}
