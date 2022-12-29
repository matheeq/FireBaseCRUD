package com.sampleFirebaseDemo.model;

public class EmpModel {

	
	private String name;
	private int age;
	private String location;
	private Double sal;
	
	public EmpModel() {
		super();
	}

	public EmpModel(String name, int age, String location, Double sal) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmpModel [name=" + name + ", age=" + age + ", location=" + location + ", sal=" + sal + "]";
	}
	
	
	
	
}
