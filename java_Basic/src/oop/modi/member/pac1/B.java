package oop.modi.member.pac1;

public class B {

	public B() {
		
		A a = new A();
		a.x = 1; // public
		a.y = 2; //default
	  //a.z = 3; // private 이라서 안된다.
		
		a.method1();
		a.method2();
	 // a.method3(); // private 이라서 안된다.
		
	}
}
