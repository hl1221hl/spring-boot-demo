package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.entity.User;

/**
 * Created by jiangzhiyong on 15/12/8.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectAll() {
        return userDao.selectAll();
    }

}
