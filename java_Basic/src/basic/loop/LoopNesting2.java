package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
       
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력받은 수 : ");
//		int num = sc.nextInt();
//		
//		int sosu = 0; //소수의 개수를 기억해 줄 변수.
//		
//		System.out.print("소수: ");
//		for(int i=1;i<=num;i++) {
//			int ss = 0; //소수의 판별을 위해 약수의 개수를 세어줄 변수.
//			for(int j=1;j<=i;j++){ //i가 소수로 판단될떄
//				if(i % j == 0) {
//					ss++;
//				}
//			}
//			if(ss == 2) {
//				System.out.print(i + " ");
//				sosu++;
//			}
//		}
//		
//		System.out.println("\n소수의 개수: " + sosu + "개");
		
		
		
		
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받은 수 ->");
		
		System.out.println("소수:");
		
		int sosus = sc.nextInt(); //소수의 개수 초기화
		int count = 0;
		for(int i=1;i<=sosus;i++) {
			int counts = 0;
			for(int a=1; a<=i; a++) {
				if(i % a == 0) {
					counts++;
				}	
			}
			if(counts == 2) {
				count++;
			}
		}
		System.out.printf("소수의개수: %d", count);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
