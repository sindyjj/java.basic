package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"삽겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		System.out.println("===================================================");

		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 음식을 입력하세요: ");
		String name = sc.next();

		boolean flag = true;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {                //ex1)
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("음식이 없습니다");
		}
		
		/* else if(i == food.length-1){
		 * system.out.println("없는 음식입니다.")     ex2)
		 * }*/
		
		//----------------------------------------------------
		// int i; 
		
		/* for(i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {                //ex3)
				System.out.println("탐색 완료!");
				System.out.println("인덱스: " + i + "번");
				break;
			} 
			*/







	}

}
