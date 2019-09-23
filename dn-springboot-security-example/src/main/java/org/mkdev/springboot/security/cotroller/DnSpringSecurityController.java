package org.mkdev.springboot.security.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muthukumar thangavinayagam.
 *
 */

@RestController
public class DnSpringSecurityController {

	@RequestMapping("/rest/sayHello")
	public String sayHello() {

		return "Hello receiver";
	}

}
