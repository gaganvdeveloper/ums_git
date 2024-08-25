package org.jsp.ums.dao;

import org.jsp.ums.entity.User;

public interface UserDao {

	User saveUser(User user);

	User updateUserById(User user);

}
