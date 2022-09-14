package com.wrapp.java;
/*wrapper class
 * autoboxing:process of converting primitive's data type into object called as "Autoboxing."
 * unboxing:process of converting object into primitive's data type called as "unboxing."
 */
public class WrapperDemo {

	public static void main(String[] args) {
		
		int a = 20;//primitive data type
		
		Integer i = new Integer(a);//autoboxing
		System.out.println("i>>" +i);
		
		int b = i.intValue();//unboxing
		System.out.println("b>>" +b);
	}

}
