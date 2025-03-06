package edu.jsp.User_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.User_app.dao.UserDao;
import edu.jsp.User_app.dto.User;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	
	public User fetchById(int id) {
		return dao.fetchById(id);
	}
	
	public List<User> fetchAll() {
		return dao.fetchAll();
	}


}
