package com.luv2code.aopdemo;

public class Account {

	private String name;
	private String level;
	private Integer intLevel;
	
	public Account() {
		
	}

	public Account(String name, String level) {
		this.name = name;
		this.level = level;
	}



	public Integer getIntLevel() {
		return intLevel;
	}

	public void setIntLevel(Integer intLevel) {
		this.intLevel = intLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + ", intLevel=" + intLevel + "]";
	}
}
