//식별자 연습//
package basic.begin;

public class identifier {

	public static void main(String[] args) {
		
		//1.식별자 이름은 중복을 허용하지 않습니다.
		//그리고 , 대/소문자를 철저하게 구분해야한다.
		
		int age = 35; // 정수함수 age = value;
//		int age = 40; (x)
		int Age = 40; //(o) 대소문자가 위랑 다르기 떄문에 적용이 된다.
		
		System.out.println(age);
		System.out.println(Age);
		
		//2.식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안됩니다.
		
		//int 123 = 60;
		//System.out.println(123);\
		// 좌항 곧 함수지정명에 숫자를 지정하니 에러가 뜨는 것.
		
		//int 7number =7;(x)
		int number7 = 7; // (o)
		System.out.println(number7);
		
		//3.식별자 이름에 공백을 포함할 수 없습니다.
		
		//int my birth day = 19981030;//(x)
		//int mybirthday = 19981030;//(o)
		int myBirthDay = 19981030;//(o) 
		//camel case 표기법 문법 이란 뛰어쓰기 대신 제일 앞에 오는 문자를 대문자로 기입
		System.out.println(myBirthDay);
		
		//4. 식별자에 쓸 수 있는 특수문자 밑줄(_),달러기호($)
		//뿐입니다. 하지만 사용을 권장하지는 않습니다.
		//저 특수문자들은 사용하기로 약속된 곳이 지정되어 있습니다.
		
		String _hello = "안녕"; //노란줄은 명령을 하지않아서 노란줄은 신경 ㄴ 
		System.out.println(_hello);
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 내용을 내포하고 있는 지정 문자입니다.
		
		//String class = "클래스"; //(x) 예약어(키워드)=class
		String Class = "클래스"; //(o) 
		System.out.println(Class);
		//예약어는 다 소문자기 때문에 대문자면 가능은 하지만 권장은 하지않다.
		
		/* abstract  continue  for         new        switch
		assert    default   goto        package    synchronized
		boolean   do        if          private    this
		break     double    implements  protected  throw
		byte      else      import      public     throws
		case      enum      instanceof  return     transient
		catch     extends   int         short      try
		char      final     interface   static     void
		class     finally   long        strictfp   volatile
		const     float     native      super      while
		 등등 있다. 씨벌.... */
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능하다만
		//사용을 권장하진 않는다.
		
		int 숫자 = 10;
		String 元 = "원";
		System.out.println(숫자);
		System.out.println(元);
		
		//총 정리 //
		/* ## 코딩 컨벤션(convention)

		- 관례 라고도 함.
		- 안 지켜도 상관 없지만, 앞으로 자바를 계속 쓸 생각이라면 지켜서 작성하는 게 좋음.

		- 클래스 / 인터페이스 이름 규칙
    		- 명사나 형용사를 연결하여 작성하기.
    		- 첫 글자는 대문자로!!!! 소문자로 쓰면 변수와 구분하기 어려움.
    		- 파스칼 케이스(연결 글자의 첫 글자를 대문자로) 적용하기
    		
		- 변수 이름 규칙
   		 - 명사적 의미를 갖게 하자.
    	- 소문자가 기본. 카멜 케이스 적용하기.
    		
		- 패키지 이름 규칙
   		 - 소문자로 작성하기
   		 - 카멜케이스 적용하지 않음. 
   		 두 단어가 합쳐질 것 같으면 패키지를 나누셈.
   		 
		- 메서드 이름 규칙
   		 - 동사적 의미를 갖게 하자. 기능에 대한 명세이기 때문
    	- 소문자로 시작이 기본.
   		 - 괄호가 들어간다.
				 */
	}

}
