package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.demo.entity.User;

@Component
public interface UserDao {

    static final String KEYS = "id,username,password,ctime";

    @Select("select " + KEYS + " from user ")
    public List<User> selectAll();
    
    @Insert("insert into user (username, password, ctime) values (#{username},#{password},#{ctime})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    public void insert(User user);
}
