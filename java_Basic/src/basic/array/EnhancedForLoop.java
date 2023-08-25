package basic.array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		/*   ★★★★ 인덱스 값을 다 쓰려면 향상된 for문이 좋고 거기서 골라서 쓸꺼면 일반for문을 써야한다. ★★★
        # 향상된 for문 (forEach)
        - 제어변수(인덱스)의 사용 없이 배열 내부의 요소를
         전체 참조할 수 있게 해 주는 반복문.
         
        ex)
        for(배열 요소를 받아줄 수 있는 변수 : 배열변수명) {
            반복 실행문
        }
        */
		String[]week = {"월","화","수","목","금","토","일"};
		
//		for(int i=0; i<week.length; i++) {
//			System.out.println(week[i] + "요일");
//		}	

		
		for(String day : week) { // (반복하고싶은 변수 타입과 변수명지정 : 내가 반복하고싶은 변수명)
			//day 에 week 문자열 값 순서대로 문장 돌떄 1번씩 적용된다
			System.out.println(day + "요일" );
		}
		
		/*
        1. scores라는 이름으로 int배열을 하나 선언해서
        점수 데이터를 저장하세요.
        {96, 88, 74, 63, 100, 55}
        
        2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
        총점(int), 평균(double, 소수점 둘째 자리까지 출력)
       */
		
		int [] scores = {96,88,74,63,100,55};
		
		int total = 0;
//		for(int i=0; i<scores.length; i++) {
//			System.out.print("총 점 : "+(scores[0] + scores[1] + scores[2] + scores[3] + scores[4] + scores[5]));
//		}  내가 한 것
		
		System.out.println("--------------------------------------------------");
		
		for(int s : scores) {
			total += s;
		}
		double avg =  (double) total / scores.length; // 물어봐야함 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		
		System.out.printf("총점: %d점, 평균 %.2f점\n", total,avg);
		
}
}
