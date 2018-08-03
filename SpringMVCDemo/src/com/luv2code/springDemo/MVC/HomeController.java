package com.luv2code.springDemo.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
