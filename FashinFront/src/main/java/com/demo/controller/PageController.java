package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String test() {
		return "index";
	}

    @RequestMapping(path = "/login", method = RequestMethod.GET)
	public String ShowLogin() {
		return "Login";
	}

    @RequestMapping(path = "/register", method = RequestMethod.GET)
	public String ShowRegister() {
		return "Register";
	}

    @RequestMapping(path = "/aboutus", method = RequestMethod.GET)
	public String ShowAboutUs() {
		return "AboutUs";
	}

    @GetMapping("/category")
	public String Showcontactus() {
		return "ContactUs";
	}

}
