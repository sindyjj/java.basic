package oop.this_super;

public class Warrior extends Player { //player 에 최상위 부모는 object다

	int rage;
	
	Warrior(String name){
		// 비어있는 기본에 super(); 이 삽입이 되어있다 눈에는 안보인다.
		// 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		// 부모의 속성과 기능이 실존하게 되고, 물려 줄 수 있기 때문입니다.
		// player() 나 warrior() 다 부모 요소가 있다.
		super(name);
		this.rage = 30;
	}
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
}
