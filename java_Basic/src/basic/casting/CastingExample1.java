//형 변환(type casting) //

package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		  - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		  자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해줍니다.
		  (promotion, UpCasting)
		 */
		
		byte b = 10; //byte(물컵) b = 10;
		int i = b;
		//int(대야) i = 물컵 (value = 10)물컵이 작기때문에 키워도 괜찮다; 
		System.out.println(i);
		
		char c = 'A'; //물컵 c = '65'
		int j = c;	//대야 j = 물컵c
		System.out.println(j);
		
		//char c = '홓'; //물컵 c = '54867'
		//int j = c;	//대야 j = 물컵c
		System.out.println("'홓'의 문자 번호: "+j);
		
		int k = 500;
		double d = k;
		System.out.println(d);

	}

}
