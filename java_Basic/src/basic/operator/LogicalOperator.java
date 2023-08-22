//비교 연산자 //

package basic.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//비교(관계) 연산자(<,<=,>,>=,==,!=)
		//좌항과 우항의 크기를 비교하여, 결과값으로 
		//항상 논리형 타입의 값을 도출합니다.
		
		int x = 10, y = 20;
		System.out.println(x != y);
		
		/*
        # 논리 연산자 (&, &&, |, ||)
        - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
        1. &, &&(and 연산자): 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
        2. |, ||(or 연산자): 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.
        
        &&, || -> 단축 평가 연산 (short circuit operation)
        - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
         우항의 연산을 진행하지 않습니다.
        */
		
		System.out.println(x > 10 && (y / 0 ==10));
		//&& : 좌항이 false기 때문에 우항을 보지않고서도 결과값이 false가 나온다.
		// & : 좌항이 false여도 우항을 봐야하는데 우항에 0이란 
		System.out.println(x >= 10 || (y / 0 ==10));
		// 논리 반전 연산자 (!:단
		// 단순히 논련값을 반전시킬때 사용한다
		// true -> false , false -> true
		
		int z = 10;
		System.out.println(z ==10); // 반대 부정의미 (z !=10);
		
		
		
		
		
	}

}
