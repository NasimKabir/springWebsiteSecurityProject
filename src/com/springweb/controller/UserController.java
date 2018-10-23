package com.springweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb.model.User;
import com.springweb.service.UserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl service;

	@RequestMapping(value = "/createaccount", method = RequestMethod.GET)
	public String showfrom(Model model) {
		model.addAttribute("userfrom", new User());
		return "createAccount";
	}

	@RequestMapping(value = "/createaccount", method = RequestMethod.POST)
	public String createuser(@Valid @ModelAttribute("userfrom") User user, BindingResult result) {
		if (result.hasErrors()) {
			return "createAccount";
		}
		user.setAuthority("user");
		user.setEnabled(true);
		if(service.exists(user.getUsername())) {
			result.rejectValue("username", "username", "This name is already exits");
			return "createAccount";
		}
		
			service.create(user);
		
		return "newAccount";
	}
}
