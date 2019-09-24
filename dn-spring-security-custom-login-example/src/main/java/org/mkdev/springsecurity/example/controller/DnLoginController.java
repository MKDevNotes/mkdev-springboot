package org.mkdev.springsecurity.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DnLoginController {

	@RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public String welcome() {
		return "login";
	}

	@GetMapping(value = "/userRegister")
	public String registerPage() {
		return "register";
	}

	@GetMapping(value = "/reset")
	public String resetPage() {
		return "resetpassword";
	}

	@GetMapping(value ="/successPage")
	public String userWelcome() {
		return "welcome";
	}
	
	//{"timestamp":"2019-09-24T14:30:48.894+0000","status":999,"error":"None","message":"No message available"}
	
}
