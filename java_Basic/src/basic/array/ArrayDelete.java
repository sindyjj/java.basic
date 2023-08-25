package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,11,13}; 
		// 7을 지울꺼니까 9가 5번째가 아닌 4번째가 된다 
		//{1,3,5,9,11,13,13} 을 반복문으로 내려서 {1,3,5,9,11,13}
		
//		arr [3] = arr[4];
//		arr [4] = arr[5];
//		arr [5] = arr[6];

		// 삭제되는 값을 기준으로 뒤에 있는 값을 한 칸씩 앞으로 떙기는 작업.
		// 추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 하기 위해 하는 작업.
		for(int i = 3; i<arr.length-1; i++) { // -1 쓴이유 맨 뒤에 값은 더 땡겨올 값이 없어서
			arr[i] = arr[i+1];
			
		}
		//위에 결과값 {1,3,5,9,11,13,13}
		
		//기존의 배열보다 크기보다 크기가 하나 작은 새 배열을 생성
		int[] brr = new int[arr.length-1];
		
		//원본 배열의 값을 새 배열에 인덱스를 맞춰서 그대로 대입
		
//		brr[0] = arr[0];
//		brr[1] = arr[1];
//		brr[0] = arr[2];
//		brr[0] = arr[3];
		
		for(int j=0; j<brr.length;j++) {
			brr[j] = arr[j];
		}
		
		System.out.println(arr);
		System.out.println(brr);
		
		arr=brr; //brr 배열의 주소값을 arr한테 넘긴다.
		brr=null;// 주소 값을 지워서 메모리에서 brr는 자동 소멸된다.
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
