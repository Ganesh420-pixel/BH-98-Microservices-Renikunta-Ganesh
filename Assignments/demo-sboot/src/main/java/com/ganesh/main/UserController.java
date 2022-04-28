package com.ganesh.main;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final UserRepository userRepository;
	
	UserController(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	@GetMapping("/users")
	List<User> allUsers()
	{
		return userRepository.findAll();
	}
}
