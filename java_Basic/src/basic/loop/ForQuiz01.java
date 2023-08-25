package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19까지 난수를 생성하셔서 구구단을 출력해 보세여. for
		// 19행 까지 출력하세요.
		
		System.out.println("구구단을 출력해보세요: ");
//		int dan = (Math.random())
//		int w = 2;
//		for(int i=2;i<=19;i++) {
//			while(w<=19) {
//				System.out.printf(w + "*" + i + "=" + (w*i));
//				
//			} 내가한 것
//		}
		
		int dan = (int) ((Math.random()*18) +2);
		
		System.out.println("*** 구구단" + dan + "단 ***");
	    System.out.println("----------------------------------");
	    
	    for(int hang=1; hang<=19; hang++) {
	    	System.out.printf("%d x %d = %d\n" , dan,hang,dan*hang);
	    }
	    
	        //fm     복습 필요 -
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  //2~19까지 난수를 생성하셔서 구구단을 출력해 보세여. for
	  		// 19행 까지 출력하세요.
		
		System.out.println("구구단을 입력해 보세요: ");
		System.out.println("----------------------------");
		
		int dan1 = (int) ((Math.random()*18)+2);
		System.out.printf("구구단%d" + "단\n", dan1);
		for(int i=1; i<=19; i++) {
			System.out.println(dan1 + "X" + i + "=" + dan1+i);
		}
		

		
		
		
	}

}
