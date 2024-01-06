package com.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sys.model.Register;
import com.sys.service.RegisterService;

@Controller
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private RegisterService registerService;
	
	@GetMapping("/viewLoginPage")
	public String viewLoginPage(Model model) {

		Register register = new Register();
		model.addAttribute("register", register);

		return "login";
	}
	
	@PostMapping("/loginUser")
	public String login(@RequestParam("userEmail") String userEmail, @RequestParam ("userPassword") String userPassword, Model model){
		
		boolean login = registerService.login(userEmail, userPassword);
		if(login==true) {
		
			return "redirect:/showNewEmployeeForm";
		}else {
			Register register = new Register();
			register.setErrorMessage("Please check the email and password!");
			model.addAttribute("register", register);

			return "login";
		}
		
	}

}
