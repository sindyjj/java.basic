package oop.inherit.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior w1 =new Warrior();
		w1.level = 200;
		w1.atk = 1500;
		w1.hp = 20000;
		w1.name = "오 거";
		w1.rage = 30;
		w1.characterInfo();
		
		System.out.println("");
		System.out.println(" -----------------");
		System.out.println("");
		
		Mage m1 = new Mage();
		m1.level = 250;
		m1.atk = 1600;
		m1.hp = 10000;
		m1.name = "블리자드";
		m1.mana = 50;
		m1.characterInfo();
		
		System.out.println("");
		System.out.println(" -----------------");
		System.out.println("");
		
		Hunter h1 = new Hunter();
		h1.level = 220;
		h1.atk = 2000;
		h1.hp = 8000;
		h1.name = "레골라스";
		h1.pet = "이글";
		h1.characterInfo();
		
		System.out.println("");
		System.out.println(" -----------------");
		System.out.println("");
		
		
	}

}
