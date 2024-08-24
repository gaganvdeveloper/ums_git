package org.jsp.ums.daoimpl;

import org.jsp.ums.dao.UserDao;
import org.jsp.ums.entity.User;
import org.jsp.ums.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository repository;
	
	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

}
