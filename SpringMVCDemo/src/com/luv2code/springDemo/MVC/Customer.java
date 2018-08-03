package com.luv2code.springDemo.MVC;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springDemo.MVC.validation.CourseCode;

public class Customer {
	private String firstname;
	
	@NotNull(message="should not be null")
	@Size(min=1, message="is required")
	private String lastname;
	
	@NotNull(message="should not be null")
	@Min(value=0, message="value should be grater than or equal to 0")
	@Max(value=10, message="value should be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-z0-9]{5}", message="postal code should be of 5 char/ints")
	private String postalCode;
	
	@CourseCode(value="VEN", message="It should start with VEN")
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
