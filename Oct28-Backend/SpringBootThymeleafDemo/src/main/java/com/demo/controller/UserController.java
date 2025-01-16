package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.model.User;

@Controller
public class UserController {
	
	//handler method to handle variable-expression request
	@GetMapping("/variable-expression")  //http://localhost:5500/variable-expression
	public String variableExpression(Model model)
	{
		User user = new User("Mohammed", "mohammed327@gmail.com", "admin", "Male");
		model.addAttribute("user", user);
		return "variable-expression"; //logical view name
	}
	
	//handler method for selection escpression
	
	@GetMapping("/selection-Expression")
	public String selectionExpression(Model model)
	{
		User user = new User("Mujeebuddin", "mohammed865@gmail.com", "Developer", "Male");
		model.addAttribute("user", user);
		return "selection-Expression"; //logical view name
	}
}
