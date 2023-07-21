package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {

		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43, 22, 84 };

		int temp;
		int index;

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			if (i != index) {
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}

		}
		System.out.println(Arrays.toString(arr));

		// 이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어있어야 한다

		int num = 68;

		int low = 0;
		int high = arr.length - 1;

		while (true) {
			// 1. middle에 있는 데이터와 num이랑 같은지 판단
			int mid = (low + high) / 2;
			
			if (arr[mid] == num) {
				System.out.println(mid);
				break;
			} else {
				// mid에 있는 값보다 작은지 큰지
				// low, high 값을 재설정
				if (arr[mid] > num) {
					high = mid - 1;
				} else {
					// arr[mid] < num
					low = mid + 1;
				}
			}
		}

//		int temp;
//
//		boolean sw = false;
//
//		for (int j = 0; j < arr.length - 1; j++) {
//			sw = false;
//			for (int i = 0; i < arr.length - 1; i++) {
//				if (arr[i] > arr[i + 1]) {
//					temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//					sw = true;
//				}
//			}
//			if (!sw) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

//		int lowIndex = 0;
//		int highIndex = arr[arr.length-1];
//		
//		int num = 68;
//		
//		while(true) {
//			int middleIndex = (lowIndex+highIndex)/2;
//			
//			if(arr[middleIndex]==num) {
//				break;
//			} else {
//				if(arr[middleIndex]>num) {
//					
//				}
//			}
//		}

	}

}
