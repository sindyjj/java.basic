//자동 형 변환 (Implicit Conversion, Promotion) //

package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
	
		
		char c = 'B';
		int i = 2;
		
		//서로 타입이 다른 기본 테이블의 연산 시에는 데이터 타입이 큰 쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행된다.
		
		int intResult = c + i;
		char charResult = (char) (c + i);
		// 작은쪽에서 큰쪽에 함수가 맞춰서 변환된다.
		System.out.println(intResult);//68 ? 
		System.out.println(charResult);//D ?
		
		int k = 10; //2.5가 나올려면 int k를 double로 바꾸거나
		double d = k / 4.0; // 4인 정수를 4.0인 실수로 바꾸면 double
	  //double d = int값 / int값 = int 2.5가 아닌 2.0 정수로 나온다.
		System.out.println(d);//2.5
		
		int k1 = 10;
		double d1 = (double) k1 / 4;
		System.out.println(d1);//2.5
		
		//int 보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변한되어 처리됩니다.(데이터 손실의 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);//170
	}

}
