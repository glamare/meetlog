package com.lamare.meetlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lamare.meetlog.entity.User;
import com.lamare.meetlog.service.UserService;

/**
 * The Class UserController.
 */
@Controller
@RequestMapping("/")
public class UserController {

	/** The user service. */
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView ListUsers(){
		ModelAndView modelAndView = new ModelAndView("index");
		List<User> users = userService.getListAllUsers();
		modelAndView.addObject("title", "Welcome");
		modelAndView.addObject("users", users);
		
		return modelAndView; 
	}
	
	@RequestMapping(value="about",method = RequestMethod.GET)
	public ModelAndView about(){
		return new ModelAndView("about");
	}
}