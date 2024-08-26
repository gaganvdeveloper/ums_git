package org.jsp.ums.service;

import org.jsp.ums.entity.User;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<?> saveUser(User user);

	ResponseEntity<?> deleteUserById(int id);

	ResponseEntity<?> findUserById(int id);

	
	
}

