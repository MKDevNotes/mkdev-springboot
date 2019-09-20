package org.mkdev.springboot.login.action;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author muthukumar thangavinayagam.
 *
 */

@Controller
public class DnWelcomeController {

	@RequestMapping({"/", "/welcome"})
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String resetPage() {
		return "resetpassword";
	}
}
