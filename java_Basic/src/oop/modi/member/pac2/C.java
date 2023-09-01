package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

	public C() {
		
		A a = new A();
		a.x = 1; // (o) public
//		a.y = 2; // (x) default 접근제한자라 가려놔서 다른 패키지는 안됨
//		a.z = 3; // (x) private 라 안됨
		
		a.method1(); // (o) public
//		a.method2(); // (x) default 접근제한자라 가려놔서 다른 패키지는 안됨
//		a.method3(); // (x) private 라 안됨
	}
	
}
