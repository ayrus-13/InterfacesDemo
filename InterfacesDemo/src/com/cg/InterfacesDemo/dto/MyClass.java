package com.cg.InterfacesDemo.dto;

public class MyClass implements MyInterface  {

	@Override
	public void greetings() {
		// TODO Auto-generated method stub
		System.out.println("Inside implemented class");
	}
	public static void disp() {
		MyInterface.disp();
		System.out.println("Inside static reference of implemented class");
	}
	
	public void display() {
		System.out.println("Inside overridden default method");
	}
	
}
