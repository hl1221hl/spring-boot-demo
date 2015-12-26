package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.config.DemoConfig;
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
	@RequestMapping("/all")
	public String all(Model model){
        model.addAttribute("users", userService.selectAll());
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/config")
	public Object config(){
        log.info("config");
       return  demoConfig;
	}
	
}
