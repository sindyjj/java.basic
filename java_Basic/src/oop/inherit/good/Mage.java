package oop.inherit.good;

public class Mage extends Player {
	
	int mana;

	@Override
	void characterInfo() {

		super.characterInfo();
		System.out.println("# 정신력 : " + mana);
		
		System.out.println(" ");
		System.out.println("한줄 평 : 개 사기 메테오가 있음.");
		
		
	
	}
	
	
}
