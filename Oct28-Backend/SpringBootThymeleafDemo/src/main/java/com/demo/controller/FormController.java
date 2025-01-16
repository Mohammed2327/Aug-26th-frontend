package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.UserForm;

@Controller
public class FormController {
		
	//handler method to handle the registration page
	@GetMapping("/register") //http://localhost:5500/register
	public String userRegistrationPage(Model model)
	{
		//Empty userform model object to store the form data
		
		UserForm userForm = new UserForm();
		model.addAttribute("userForm", userForm);
		
		//list of Professionsls
		List<String>listofProfessional = Arrays.asList("Select one", "Developer", "Tester", "Architecture");
		model.addAttribute("listofProfessional", listofProfessional);
		return "register-form";
	}
	
	//handle method to hanlde user registratiobn form submission rqst
	
	@PostMapping("/register/save")
	public String SubmitForm(Model model, @ModelAttribute("userForm") UserForm userForm)
	{
		model.addAttribute("userForm", userForm);
		return "register-success";
	}
}
