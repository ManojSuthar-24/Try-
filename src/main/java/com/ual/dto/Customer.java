package com.ual.dto;

public class Customer {
private String Name;
private int age;

public Customer() {
	
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Customer [Name=" + Name + ", age=" + age + "]";
}
public Customer(String name, int age) {
	super();
	Name = name;
	this.age = age;
}


}
