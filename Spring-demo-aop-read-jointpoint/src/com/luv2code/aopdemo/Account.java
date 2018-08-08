package com.luv2code.aopdemo;

public class Account {

	private String name;
	private String level;
	private Integer intLevel;
	
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

	public Account() {
		
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + ", intLevel=" + intLevel + "]";
	}
}
