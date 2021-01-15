package com.test.security.SpringSecurityTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/index")
	private String index() {
		return "index";
	}


	@RequestMapping("/user")
	private String user() {
		return "user";
	}

	@RequestMapping("/admin")
	private String admin() {
		return "admin";
	}

}
