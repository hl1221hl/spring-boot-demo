package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    
    @Transactional
    public void createUser(User user){
    	user.setCtime((int)(System.currentTimeMillis()/1000));
    	userDao.insert(user);
//    	if(1==1){
//    		throw new IllegalArgumentException("1111");
//    	}
    }

}
