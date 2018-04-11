package com.springboot.mybatis.springbootmybatis.mapper;

import com.springboot.mybatis.springbootmybatis.bean.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author gaoyun
 * 2018/4/11 9:40
 * 描述:
 */
@Component
public interface DemoMapper {
    @Select("select * from demo where name=#{name}")
    public List<Demo> likeName(@Param("name") String name);

    @Select("select * from demo where id=#{id}")
    public Demo getById(@Param("id") long id);

    @Select("select name from demo where id=#{id}")
    public String getNameById(@Param("id") long id);

    @Insert("insert into demo(name)values(#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    public void save(Demo demo);
}
