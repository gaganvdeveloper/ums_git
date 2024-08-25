package org.jsp.ums.serviceimpl;

import java.util.Optional;

import org.jsp.ums.dao.UserDao;
import org.jsp.ums.entity.User;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.jsp.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public ResponseEntity<?> saveUser(User user) {
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("User Created Successfully...").body(userDao.saveUser(user)).build());
	}

	@Override
	public ResponseEntity<?> findAllUsersById(int id) {
		Optional<User> optional=userDao.daofindUserById(id);
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.FOUND.value()).message("User Found").body(optional.get()).build());
	}
	
	
	
}