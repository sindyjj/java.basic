//형 변환 (type casting)//

package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
        - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자: (type)를 사용하여 명시적으로
         형 변환을 진행해 주셔야 합니다. (DownCasting)
         
        - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
         (overflow, underflow)
        */
		
		
		
		//int i =72; //대야
		//char c = i;//물컴 = 대야(value) 넣어줘야할 대야 값이 더 크기때문에 에러
		//System.out.println(c);
		
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: "+ c); //72=H
		// 넣어줘야할 i가 더 크기때문에 i에 (char)라는 같은 용량을 맞춰준다.

		double d =4.98765;
		int j = (int) d;
		System.out.println("여러분들의 이번 달 월급: "+ j*1000000);
		// 넣어줘야할 d가 더 크기때문에 d에 (char)라는 같은 용량을 맞춰준다.
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		//결과값이 -24가 나온 이유 : int(2진수) 
		// = 1000 = 0011 1110 1000
		// 1byte(표현할 수 있는 값 8자리) = 2(8승)=1110 1000 
		// 1= 음수 0=양수 
	}

}
