package com.cruddemo;

public class Student1 {
	int rollnum;
	String name;
	String city;
	public Student1(int rollnum, String name, String city) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.city = city;
	}
	public Student1() {
		super();
		
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student1 [rollnum=" + rollnum + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
