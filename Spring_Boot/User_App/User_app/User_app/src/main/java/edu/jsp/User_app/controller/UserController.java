package edu.jsp.User_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.User_app.dto.User;
import edu.jsp.User_app.service.UserService;

/*A convenience annotation that is itself annotated with
* {@link Controller @Controller} and {@link ResponseBody @ResponseBody}.

* Types that carry this annotation are treated as controllers where
* {@link RequestMapping @RequestMapping} methods assume
* {@link ResponseBody @ResponseBody} semantics by default.*/

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) { //@RequestBody it will bind the JSON object  to java object
		return service.saveUser(user);
	}
	
	@GetMapping("/fetch")
	public User fetchById(@RequestParam int id) { //@RequestParam it is used to get the data from query parameter 
		return service.fetchById(id);
		
	}
	
	@GetMapping("/fetchAll")
	public List<User> fetchAll() {
		return service.fetchAll();
	}

}
