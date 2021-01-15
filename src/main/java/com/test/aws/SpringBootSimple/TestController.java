package com.test.aws.SpringBootSimple;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")

	public ResponseEntity<String> saveOrder(HttpServletRequest request) {
		 return new ResponseEntity<>(
			      "status test" , 
			      HttpStatus.OK);
	}
}
