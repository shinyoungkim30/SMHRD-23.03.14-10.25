package 정렬;

import java.util.Arrays;

public class Ex03정렬 {

	public static void main(String[] args) {
		
		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };
		
		// Arrays : 배열을 다룰 수 있는 속성, 메서드의 모음 -> 클래스 -> 객체
		
		Arrays.sort(arr); // arr 배열안에 값을 정렬해서 저장
		
//		System.out.println(Arrays.sort(arr)); 불가능		
//		arr2 = Arrays.sort(arr); 불가능
		
		System.out.println(Arrays.toString(arr));

	}

}
