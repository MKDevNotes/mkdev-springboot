package com.dn.jpa.curd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserLoginController {

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public String login() {
    	return "login";
    }

    @RequestMapping("/home")
	public String homePage() {
    	return "homePage";
    }	
    
    @RequestMapping("/userLogout")
	public String userLogout() {
    	return "login";
    }	

}