package org.mkdev.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Muthukumar
 *
 */
@Controller
public class DnAjaxController {

	@RequestMapping("/")
	public String callAjaxPage() {
		return "welcome";
	}

	// https://grokonez.com/java-integration/integrate-jquery-ajax-post-get-spring-boot-web-service

	
}
