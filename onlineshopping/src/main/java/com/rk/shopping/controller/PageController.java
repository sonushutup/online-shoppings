package com.rk.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
public	ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
		
	}
	
	
	@RequestMapping(value="/about")
	public	ModelAndView about(){
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title", "about us");
			mv.addObject("userClickabout", true);
			return mv;
			
		}
	

	@RequestMapping(value="/contact")
	public	ModelAndView contact(){
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title", " Contact us");
			mv.addObject("userClickcontact", true);
			return mv;
			
		}
		

	 
}
