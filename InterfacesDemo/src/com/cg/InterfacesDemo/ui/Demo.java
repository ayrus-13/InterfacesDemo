package com.cg.InterfacesDemo.ui;

import com.cg.InterfacesDemo.dto.MyClass;
import com.cg.InterfacesDemo.dto.MyInterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mc=new MyClass();
		mc.greetings();
		MyClass.disp();
		mc.display();
		System.out.println(MyInterface.a);
		mc.display();
		System.out.println("good day");
		

	}

}
