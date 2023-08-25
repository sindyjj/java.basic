package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6]; //0~5
		
		for (int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			
			
			
			if(name.equals("그만")) { // name과 =(equals) "그만" 하고 같으면 이란 뜻
				System.out.println("입력을 종료합니다.");
				break;
			}
			names[i]=name;
		}
		
//		System.out.println(Arrays.toString(names));

		System.out.println("----------------------------------------");
		System.out.println("입력받은 이름: ");
		for(String n :names) {
			if(n == null) break;{
			System.out.print(n + " ");
			}
		}
		
		sc.close();
	}

}
