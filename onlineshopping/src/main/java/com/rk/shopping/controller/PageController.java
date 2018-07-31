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
		mv.addObject("gretting", "welcome to spring mvc ");
		return mv;
		
	}
	

	/*@RequestMapping(value={"/test"})
public	ModelAndView test(@RequestParam (value="gretting",required=false) String gretting){
		if(gretting==null){
			gretting="welcome to shopping in india";
		}
		
		
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("gretting",gretting);
		return mv;
		
	}
	*/
	
	@RequestMapping(value="/test/{gretting}")
	public	ModelAndView test( @PathVariable (value="gretting",required=false) String gretting){
			if(gretting==null){
				gretting="welcome to shopping in india";
			}
			
			
			
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("gretting",gretting);
			return mv;
			
		}
}
