package org.mkdev.thymeleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DnWelcomeController {

	@Value("${welcome.message}")
	private String title;

	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("title", title);
		model.addAttribute("message", "Hello Thymeleaf Template");
		
		return "welcome";
	}
	
	@GetMapping("/saySomething")
	public String welcomeParam(@RequestParam(name = "name", required = false, defaultValue = "") String name,
			Model model) {
		model.addAttribute("title", title);
		model.addAttribute("message", name);

		return "welcome";
	}
	
	
}
