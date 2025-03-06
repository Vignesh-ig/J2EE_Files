package edu.jsp.User_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.User_app.dto.User;
import edu.jsp.User_app.repo.UserRepository;

@Repository
public class UserDao {

	@Autowired // here spring boot will create sub class for this UserRepository Interface then
				// that sub class object will be injected.
	
	UserRepository repo; // it will inject the object based on the type.

	public User saveUser(User user) {
		return repo.save(user); //in-built method
	}

	public User fetchById(int id) {

		Optional<User> o = repo.findById(id); //in-built method

		if (o.isPresent()) {
			return o.get();
		}

		return null;
	}

	// optional is a in-built class which contains one of two methods are
	// isPresent() and isEmpty() return type is boolean.

	public List<User> fetchAll() {

		return  repo.findAll(); //in- built method
		
	}

}
