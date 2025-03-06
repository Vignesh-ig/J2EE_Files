package edu.jsp.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping(method = RequestMethod.GET, value = "get")
	public String m1() {
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "getMessage")
	public String m2(@RequestParam String message) {
		return message;
	}
	
	@GetMapping("/getStudent")
	public Student m3() {
		Student s = new Student();
		s.setName("dinesh");
		s.setAge(45);
		return s;
	}

}

