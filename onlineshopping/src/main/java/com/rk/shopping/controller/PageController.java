package com.rk.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rk.shoppingbackend.dao.CategoryDao;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categorydao;
	
	@RequestMapping(value={"/","/home","/index"})
public	ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		
		/*adding catergory objct */
		mv.addObject("Category",categorydao.list());
		
		mv.addObject("userClickHome", true);
		return mv;
		
	}
	
	
	@RequestMapping(value="/about")
	public	ModelAndView about(){
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title", "About us");
			mv.addObject("userClickabout", true);
			return mv;
			
		}
	

	@RequestMapping(value="/contact")
	public	ModelAndView contact(){
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title", "Contact us");
			mv.addObject("userClickcontact", true);
			return mv;
			
		}
		

	 
}
