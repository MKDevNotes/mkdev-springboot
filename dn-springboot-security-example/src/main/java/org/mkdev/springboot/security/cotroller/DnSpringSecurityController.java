package org.mkdev.springboot.security.cotroller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muthukumar thangavinayagam.
 *
 */

@RestController
public class DnSpringSecurityController {

	@RequestMapping({ "/", "/login" })
	public String welcome(Map<String, Object> model) {
		return "login";
	}

}
