package org.dn.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String home(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.addAttribute("title", "Hello FreeMaker Template");
		modelMap.addAttribute("message", "Welcome to MKDev Notes");
		return "hello";
	}
	
}
