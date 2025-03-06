package edu.jsp.User_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.User_app.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//save(user t); --> return type given Object
	//findById(Interger id); -- > primary key --> Optional class Object
	//findAll()
	//deleteById(Integer id)
	//save(user u) -- > update

}
