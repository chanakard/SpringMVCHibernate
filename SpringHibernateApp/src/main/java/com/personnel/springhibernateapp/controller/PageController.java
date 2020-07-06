package com.personnel.springhibernateapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	/*@RequestMapping("/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting)
	{
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	
	/*@RequestMapping("/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting)
	{
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
}