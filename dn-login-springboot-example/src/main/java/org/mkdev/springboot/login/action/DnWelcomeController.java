package org.mkdev.springboot.login.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author muthukumar thangavinayagam.
 *
 */

@Controller
public class DnWelcomeController {

	@GetMapping("/userLogout")
	public String logout() {

		return "login";
	}
}
