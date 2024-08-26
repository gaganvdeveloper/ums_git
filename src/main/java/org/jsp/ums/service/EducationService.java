package org.jsp.ums.service;

import org.springframework.http.ResponseEntity;

public interface EducationService {

	ResponseEntity<?> educationDeleteById(int id);
   
}
