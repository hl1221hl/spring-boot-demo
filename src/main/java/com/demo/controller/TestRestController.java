package com.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.UserService;


@RestController
@RequestMapping("/rest")
public class TestRestController {
	
	private static final Logger log = LoggerFactory.getLogger(TestRestController.class);

    @Autowired
    private UserService userService;
    
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseBody
	public List<User> sayWorld(@PathVariable("name") String name) {
		log.debug("get--------------"+name);
		return userService.selectAll();
	}
}
