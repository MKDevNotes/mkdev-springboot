package org.mkdev.springboot.login.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mkdev.springboot.login.model.DnUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DnUserAuthenticationController {

	@RequestMapping({ "/", "/login" })
	public String welcome(Map<String, Object> model) {
		return "login";
	}

	@PostMapping("/userLoginValidate")
	public String login(@ModelAttribute DnUser user, HttpServletRequest request) {

		System.out.println(user.getFirstName() + "  ---- " + user.getLastName());
		String navigationPath = "";
		if (user.getUsername().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("admin")) {
			navigationPath = "welcome";
		} else {
			navigationPath = "login";
		}

		return navigationPath;
	}

	@GetMapping(value = "/userRegister")
	public String registerPage() {
		return "register";
	}
	
	@GetMapping(value = "/reset")
	public String resetPage() {
		return "resetpassword";
	}
}
