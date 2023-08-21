package com.manish.Smartmanager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manish.Smartmanager.repo.UserRepo;

@Controller
public class Homecontroller {
	@Autowired
	private UserRepo repo;

	/*
	 * @GetMapping("/")
	 * 
	 * @ResponseBody
	 */
	@RequestMapping("/")
	public String test() {
		/*
		 * User user = new User(); user.setName("manish");
		 * user.setEmail("manisns@gmail.com"); repo.save(user);
		 */
		return "NewFile";

	}

	@RequestMapping("/Register")
	public String test1() {
		/*
		 * User user = new User(); user.setName("manish");
		 * user.setEmail("manisns@gmail.com"); repo.save(user);
		 */
		return "Register";

	}
}
