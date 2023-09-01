package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {

	//A a1 = new A(30); // Protected 라 안됨
	//A a2 = new A(3.14); // default 라 안됨
	
	public C() {
		
		// - protected 제한자는 패키지가 다른 경우
		// 두 클래스 사이에 상속 관계가 있다면
		// super 키워드를 통해 참조를 허용합니다.
		
		super(30); //extends 상속관계가 적용 됐을떄 적용 가능.
//      super(5,67); //default
		
		super.x = 1;
//		super.y = 2; // protected 가 아니라 default기 떄문에 안됨

		super.method1(); // (o) protected  상속관계가 성립되었으므로 된다.
//		super.method2(); // (x) default기 떄문에 안됨
		
	}
}
