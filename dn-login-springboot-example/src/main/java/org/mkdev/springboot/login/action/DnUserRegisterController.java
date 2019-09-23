package org.mkdev.springboot.login.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mkdev.springboot.login.model.DnUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DnUserRegisterController {

	@PostMapping("/userRegister")
	public String userRegistration(@ModelAttribute DnUser user, HttpServletRequest request) {

		System.out.println(user.getFirstName() + "  ---- " + user.getLastName());

		return "welcome";
	}
}
