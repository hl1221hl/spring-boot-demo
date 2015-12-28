package com.demo.controller;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.config.DemoConfig;
import com.demo.entity.User;
import com.demo.service.UserService;

@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DemoConfig demoConfig;
    @Autowired
    private UserService userService;

	/**
	 * 查询所有用户
	 * @return list<user>
	 */
    @ResponseBody
	@RequestMapping("/all")
	public List<User> all(Model model){
		return userService.selectAll();
	}
	
	@ResponseBody
	@RequestMapping("/config")
	public Object config(){
        log.info("config");
       return  demoConfig;
	}
	
	@ResponseBody
	@RequestMapping("/create")
	public Object create(){
        log.info("create");
        User user = new User();
        user.setPassword("111");
        user.setUsername(String.valueOf(new Random().nextLong()));
        userService.createUser(user);
       return  user;
	}
	
}
