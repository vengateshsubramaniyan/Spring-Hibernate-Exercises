package com.luv2code.springDemo.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processform(@ModelAttribute("student") Student student) {
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getCountry());
		System.out.println(student.getFavlang());
		return "student-configuration";
	}
}
