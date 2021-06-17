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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "redirect:/index";
    }

	/**
	 * 首页
	 */
	@RequestMapping("/index")
	public String index(Model model){
        log.info("index");
        int aaaa = 222;
        model.addAttribute("username", "jiangzhiyong");
		return "index";
	}

    /**
     * 首页
     */
    @RequestMapping("/welcome")
    public String welcome(){
        log.info("welcome");
        return "welcome";
    }

    @RequestMapping("/index3")
    public String index3(Model model){
        log.info("index");
        model.addAttribute("username", "jiangzhiyong");
        return "index";
    }
	
}
