package com.ual.Demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ual.config.SpringConfig;
import com.ual.dto.Customer;

public class App {
  public static void main(String[] args) {
//    System.out.println("Hello World!");
	  
	  AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); //Loads the container with the objects present in the config class
	  
	  
	  Customer cust = context.getBean(Customer.class);
	  Customer c2 = (Customer) context.getBean("customer"); //When calling the getBeans 
	  System.out.println(cust);
	  
	  // By default here both cust and c2 are pointing to the same object. Spring provides singleton object by default.
  }
}
