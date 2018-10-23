package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/log_out")
	public String showLogoutPage() {
		return "log_out";
	}
}
