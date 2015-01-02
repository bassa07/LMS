package org.myprojects.lms.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.apache.log4j.Logger;
//import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class LoginController{
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcomeLMS()
	{
		logger.info("Invoked Welcome LMS");
		ModelAndView mv= new ModelAndView("LeaveRequest");
		return mv;
	}
    
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public ModelAndView displayLogin()
	{
		logger.info("Invoked displayLogin");
		ModelAndView mv= new ModelAndView("Login");
		return mv;
	}
	
	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public ModelAndView response(@RequestParam Map<String,String> reqparam)
	{
		logger.info("Invoked Validate");
		String uName=reqparam.get("username");
		ModelAndView mv= new ModelAndView("response");
		mv.addObject("userdetails", "Hi,"+uName+"you have loggedin successfully");
		return mv;
	}
}