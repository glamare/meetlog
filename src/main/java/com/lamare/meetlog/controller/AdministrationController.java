package com.lamare.meetlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lamare.meetlog.service.UserService;

@RequestMapping("/admin")
public class AdministrationController extends AbstractController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public ModelAndView listUsers(){
		ModelAndView modelAndView = createModelAndView("tiles:admin/listUser", "Admin - Liste des utilisateurs");
		modelAndView.addObject("users", userService.getListAllUsers());
		return modelAndView;
	}
}
