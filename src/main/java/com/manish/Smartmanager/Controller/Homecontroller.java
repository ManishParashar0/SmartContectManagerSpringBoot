package com.manish.Smartmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manish.Smartmanager.Entity.User;
import com.manish.Smartmanager.repo.UserRepo;

@Controller
public class Homecontroller {
	@Autowired
	private UserRepo repo;

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user = new User();
		user.setName("manish");
		user.setEmail("manisns@gmail.com");
		repo.save(user);
		return "test";

	}
}
