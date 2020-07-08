package com.personnel.springhibernateapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.personnel.springhibernateappbe.SpringHibernateAppBE.dao.CategoryDAO;
import com.personnel.springhibernateappbe.SpringHibernateAppBE.dto.Category;

@Controller
public class PageController {

	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);

		// Passing the categories
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/*
	 * Methods to load all the products
	 */

	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("Page");
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProducts", true);

		// Passing the categories
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("Page");
		
		//categoryDAO to fetch one category
		Category category = null;
		category = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		
		//passing the single category
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);

		// Passing the categories
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}

	/*
	 * @RequestMapping("/test") public ModelAndView
	 * test(@RequestParam(value="greeting",required=false) String greeting) {
	 * ModelAndView mv = new ModelAndView("Page"); mv.addObject("greeting",
	 * greeting); return mv; }
	 */

	/*
	 * @RequestMapping("/test/{greeting}") public ModelAndView
	 * test(@PathVariable("greeting") String greeting) { ModelAndView mv = new
	 * ModelAndView("Page"); mv.addObject("greeting", greeting); return mv; }
	 */
}
