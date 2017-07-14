package com.skilldistillery.springmvclab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCLabController {

	@RequestMapping("route.do")
	public ModelAndView getData(@RequestParam("data") String data) {
		ModelAndView mv = new ModelAndView();
		String s = data.toUpperCase();
		
		String [] places = 
			{"the WORLD!", "the UNIVERSE!", "the GALAXY!", "NOTHING! ABSOLUTELY NOTHING!", "FRANCE! Wait, nobody's impressed."};
		
		int rand = (int) (Math.random()*5);
		
		
		mv.setViewName("view.jsp");
		mv.addObject("result", s);
		mv.addObject("place", places[rand]);
		
		return mv;
	}
}
