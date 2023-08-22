//문자형//
package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		
		char c1 = 'A'; 
		//char c1 = 'AB';(X)단일문자 밖에 안된다
		//char c1 = "AB";(X)홋따움표밖에 안된다.
		System.out.println(c1);
		
		char c2 = 65;//65번은 저장을 못한다 다만 65번이 데이터값으로 A이다.
		System.out.println(c2);
		
		char c3 = 44032;
		//44032번은 저장을 못한다 다만 44032번이 데이터값으로 (가)이다.
		System.out.println(c3);
		
		/* 
		 * String 
         # 문자열을 저장할 수 있는 데이터 타입 String
         - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
         - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
         기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
         ----------------------------------------
         간단하게 말해서 String은 문자를 다루는 타입이다. 
		 */
		
		String s1 = "my dream ";
		//키워드 아님 "(단일문자에 나열 , 문자열로 취급)"
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈 연산을 지원합니다.
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다.
		
		System.out.println(s1 + s2); // 문자열의 합
		
		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		System.out.println("==============================");
		
		System.out.println(100+100);//200
		System.out.println("100"+"100");//100100
		System.out.println(100+"100");//100100
		System.out.println(3.14+"hi");//3.14hi
		
		int month =10;
		int day =13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 "+month+"월 "+day+"일"+"입니다.");
		
	}

}
