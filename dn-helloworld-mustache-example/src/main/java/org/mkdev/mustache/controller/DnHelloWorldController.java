package org.mkdev.mustache.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Muthukumar Thangavinayagam
 *
 */
@Controller
public class DnHelloWorldController {

	@Value("${app.welcome.message}")
	private String message = "";

	@Value("${app.welcome.title}")
	private String title = "";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		// TODO Auto-generated method stub
		model.put("title", title);
		model.put("message", message);
		return "welcome";
	}

	// test 5xx errors
	@RequestMapping("/5xx")
	public String ServiceUnavailable() {
		throw new RuntimeException("ABC");
	}

}
