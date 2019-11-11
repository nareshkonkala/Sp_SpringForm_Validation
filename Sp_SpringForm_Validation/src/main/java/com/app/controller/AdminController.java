package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/reg")
	public ModelAndView showForm() {
		ModelAndView m=new ModelAndView();
		m.setViewName("AdminRegister");
		Admin a=new Admin();
		m.addObject("admin",a);
		
		return m;
	}
	@RequestMapping(value = "/send" , method=RequestMethod.POST)
	public ModelAndView formData(@ModelAttribute("admin") Admin ad) {
		ModelAndView m=new ModelAndView();
		m.setViewName("Data");
		m.addObject("admin",ad);
		return m;
	}
	

}
