package com.luv2code.springDemo.MVC.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.sun.org.apache.regexp.internal.recompile;


public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
		coursePrefix = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext theConstraintValidatorContext) {
		if (courseCode == null) {
			return true;
		}
		boolean result = courseCode.startsWith(coursePrefix);
		return result;
	}

}
