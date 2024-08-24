package org.jsp.ums.controller;

import org.jsp.ums.entity.User;
import org.jsp.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}

//	@PutMapping        													// Vikas and Group
	
	
//	@GetMapping(value =  "/{id}")   												// Bharath  & vamshi & Venkatesh
	
	
//	@GetMapping     													// Misba and Group
	
	
//	@PatchMapping(value = "/inactive/{id}")								// Rizwan
	
	
//	@PatchMapping( value = "/active/{id}") 								// Rizwan
	

//	@PatchMapping(value = "/blocked/{id}")								// Rizwan
	
	
//	@DeleteMapping(value =  "/{id}") 									// Chetana and Group
	
	
	
}
