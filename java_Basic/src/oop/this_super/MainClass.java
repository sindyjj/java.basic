package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "원정욱";
//		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		
		System.out.println("------------------------------------");
		
		Player p2 = new Player("성삼경");
//		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("------------------------------------");
		
		Player p3 = new Player("김한솔",200);
//		System.out.println("p3의 주소값: " + p3);
		p3.characterInfo();
		
		
		p3.attack(p2); // 같은 p3 주소값을 가진 양쪽은 존재할 수 없다.
		
		System.out.println("------------------------------------");
		
		Warrior w1 = new Warrior("훈 모");
		w1.characterInfo();
		
		Mage m1 = new Mage("마법사");
		m1.characterInfo();
		
		Hunter h1 = new Hunter("헌터");
		h1.characterInfo();
		
	}

}
