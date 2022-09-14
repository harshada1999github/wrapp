package com.wrapp.java;
/*Final method : which is defined with final keyword called as final method
 * final method cannot be Overriden
 */
class X {
	final void test() {
		System.out.println("this is x class-test method");
	}
class Y extends X{
	final void test() {
		System.out.println("this is y class-test method");
	}
		public static void main(String args[]) {
			X x = new Y();
			x.test();
		}
		
	}
		
	}
		

	


