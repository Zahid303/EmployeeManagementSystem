package com.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.model.Register;
import com.sys.service.RegisterService;

@Controller
@RequestMapping("/api")
public class RegistrationController {

	@Autowired
	private RegisterService registerService;

	@GetMapping("/register")
	public String viewRegisterPage(Model model) {

		Register register = new Register();
		model.addAttribute("register", register);

		return "register";
	}

	@PostMapping("/saveRegistration")
	public String saveRegister(@ModelAttribute("register") Register register) {

		// Save Employee to database
		registerService.saveRegister(register);
		return "login";
	}

}
