package oop.this_super;

public class Player/* extends object 기본값*/ { 
				//player 에 최상위 부모는 object다

	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
//		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);//this주소값 =p1 주소값
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name){
		this();   // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야합니다.
		//System.out.println("Player 의 2번 생성자 호출!"); 
//		System.out.println("this의 주소값: " + this);//this주소값 =p2 주소값 
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name; // this 붙치면 이 열에게 집중해라 느낌
	}
	
	void attack(Player target) {
		
//		System.out.println("target 의 값은: " + target);
//		System.out.println("this 의 값은: " + this);
		
		System.out.println("----------------------------------------");
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		//출력 메세지: x가 y를 공격합니다.
		System.out.printf("%s(이)가 %s(을)를 공격합니다.\n",this.name,target.name);
		
		// 이해 안됨 //  위
	
		//맞는 사람의 hp 10 낮추고 나의 체력을 5 회복하고 싶다.
		//결과를 출력하자 (나의 체력 : xx , 상대의 체력 : xx)
		
		target.hp -= 10; // target.hp = target.hp - 10
		this.hp += 5; // this.hp = this.hp + 5
		System.out.printf("김한솔(님) 체력: %d, 성삼경(님) 체력: %d\n",this.hp,target.hp);
		
		
		
		
	}
	
	Player(String name, int hp){
		this(name);
		//System.out.println("Player 의 3번 생성자 호출!");
		//this.name = name;
		this.hp = hp;
	}
	
	
	
	void characterInfo(){
		
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디 : "+ name);
		System.out.println("# 레벨 : "+ level);
		System.out.println("# 공격력 : "+ atk);
		System.out.println("# 체력 : "+ hp);
//		System.out.println("이 메서드를 호출한 객체의 이름은: "+ this.name);
		
		
	}
}
