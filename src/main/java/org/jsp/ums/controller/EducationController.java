package org.jsp.ums.controller;

import org.jsp.ums.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educations")
public class EducationController {
	   @Autowired
	  EducationService educationService;
	
	
//	@PostMapping    				Safdar
	
	
	
//	@PutMapping  					Venkatesh
	
	
//	@GetMapping("/{id}") 			Ranjitha
	
	
	
	
	@DeleteMapping("/{id}")			//Sanjeev 
    public ResponseEntity<?> educationDeleteById(@PathVariable int id){
		
		return educationService.educationDeleteById(id);
	}
	
	
	
	
	
}
