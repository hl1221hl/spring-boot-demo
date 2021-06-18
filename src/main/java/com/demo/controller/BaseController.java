package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * asdasd
 */
@Controller
public class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);
    public static final String INDEX = "index";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "redirect:/index";
    }

	/**
	 * 首页
	 */
	@RequestMapping("/index")
	public String index(Model model){
        log.info("this is index");
        int aaaa2222 = 222;
        model.addAttribute("username", "jiangzhiyong");
		return INDEX;
	}

    /**
     * 首页
     */
    @RequestMapping("/welcome")
    public String welcome(){
        log.info("this is welcome");
        return "welcome";
    }

    @RequestMapping("/index3")
    public String index3(Model model){
        log.info("this is index3");
        model.addAttribute("username", "jiangzhiyong");
        return INDEX;
    }
	
}
