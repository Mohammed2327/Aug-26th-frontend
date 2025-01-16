package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	 
	@GetMapping("/getuser") //http://localhost:5454/user/getuser
	public String getUser(Model model)
	{
		User user = new User("Mohammed", "25", "mohammed327@gmail.com", "Developer");
		
		model.addAttribute("user", user);
		
		return "user_page";
	}
}
