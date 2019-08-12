package org.mkdev.ajax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Muthukumar
 *
 */
@RestController
@RequestMapping("/api/ajaxdemo")
public class DnRestController {
	
	@GetMapping(value = "/testmsg")
	public String getAjaxText() {

		return "Hello Ajax Example";
	}
}
