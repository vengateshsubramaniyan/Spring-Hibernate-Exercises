package com.luv2code.springDemo.MVC;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favlang;
	private String[] os;
	
	public String[] getOs() {
		return os;
	}
	public void setOs(String[] os) {
		this.os = os;
	}
	public String getFavlang() {
		return favlang;
	}
	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("India", "India");
		countryOptions.put("US", "United States");	
		System.out.println("Default Constructor for Student Class");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
