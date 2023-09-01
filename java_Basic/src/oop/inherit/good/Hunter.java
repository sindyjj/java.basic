package oop.inherit.good;

public class Hunter extends Player {

	String pet;

	@Override
	void characterInfo() {
		
		super.characterInfo();
		System.out.println("# 펫 이름 : " + pet);
		System.out.println(" ");
		System.out.println("한줄 평 : 펫 존나 약함.");
	}
	
	
}
