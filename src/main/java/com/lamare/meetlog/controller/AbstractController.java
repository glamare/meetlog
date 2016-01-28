package com.lamare.meetlog.controller;

import org.springframework.web.servlet.ModelAndView;

public abstract class AbstractController {
	
	public ModelAndView createModelAndView(String view, String title){
		ModelAndView response = new ModelAndView(view);
		response.addObject("title", title);
		return response;
	}
}
