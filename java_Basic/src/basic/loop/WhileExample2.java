package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
//		int i = 48;
//		while(i<=150) {
//			
//				System.out.println(i + " ");
//				i += 8;
//			}
//		
//		System.out.println();//단순 줄 개행
		
		//1~100까지의 정수 중  4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해보세요/
		
//		int q = 1;
//		while(q <= 100) {
//			if(q % 4 == 0 && q % 8 != 0) {
//			System.out.print(q + " ");
//		}
//			q++;
//		}
//		
//		
//		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력
		
//		int w = 1;
//		int count = 0; //배수의 개수를 세어줄 변수.
//		while (w <= 30000) {
//			if(w % 258 == 0) {
//				count++;
//				
//			}
//			w++;
//		}
		
//		System.out.println("1~30000중 258의 배수의 개수: " + count + "개");
		
		
		//1000의 약수의 개수를 구하세요.
		
		int z = 1;
		int counts = 0;
		while(z <= 1000) {
			if(1000 % z== 0) {
				counts++;
			}
			z++;
		}
		
		System.out.println("1000의 약수의 개수: " + counts + "개");
	}
}


