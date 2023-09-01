package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		//my.year = 12345678; //method 란 문지기를 세울 예정
		my.setYear(1998);
		my.setMonth(10);
		my.setDay(30);
		
		
		System.out.printf("%d년 %d월 %d일 입니다.\n ",
				my.getYear("원정욱"), my.getMonth(),my.getDay());
	}
}
