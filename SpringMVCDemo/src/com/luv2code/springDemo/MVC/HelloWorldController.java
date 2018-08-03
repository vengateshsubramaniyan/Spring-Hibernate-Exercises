package com.luv2code.springDemo.MVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String shoutOut(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo! " + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(HttpServletRequest request, @RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "Yo! from version3 " + theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
