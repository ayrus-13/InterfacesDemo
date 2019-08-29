package com.cg.InterfacesDemo.dto;

public interface MyInterface {
	
	int a=10;
	
	void greetings();
	static void disp() {
		System.out.println("Inside the interface static method");
		//display();
	}
	default void display() {
		System.out.println("This is interface default method");
	}
	
}
