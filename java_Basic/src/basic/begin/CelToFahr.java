package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		/*
        사용자에게 섭씨온도를 입력받아서
        화씨온도로 변환하여 출력하는 로직을 작성하세요.
        변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
        화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
        # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
        */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("섭씨온도를 입력하시오: ");
//		int sub = sc.nextInt();
//		
//		System.out.printf("입력한 섭씨온도를 화씨온도 변환값 %d", tus);
//		double tus = ((sub * 9/5)+32);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨온도를 입력하세요: ");
		int sub = sc.nextInt();
		
		double fahr = ((sub * 9.0) / 5 + 32); // 의문 복습 9.0이유 모름 복습!!
		
		System.out.printf("입력한 섭씨 : %dc\n", sub); //복습   .1이 소수점 첫번째자리
		System.out.printf("변환한 화씨 : %.1ff\n",fahr);//복습    
		
		sc.close();
		
		
		
		
		
		
		

	}

}
