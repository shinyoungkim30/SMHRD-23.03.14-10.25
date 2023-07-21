import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {

		// 랜덤 객체
		// 레퍼런스 변수
		Random rd = new Random();

		// 배열을 랜덤값 초기화
		int[] array = new int[10];
		// 정수배열 선언시 기본값 0

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
		}
		System.out.println(Arrays.toString(array));

		// -----------------------------------------

		int max = 0;
		int min = 20;

		for (int j = 0; j < array.length; j++) {
			if (array[j] > max) {
				max = array[j];
			} else if (array[j] < min) {
				min = array[j];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

		// ----------------------------------
		// 최대값
		int max1 = array[0];
		int min1 = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max1 < array[i]) {
				max1 = array[i];
			}
			if (min1 > array[i]) {
				min1 = array[i];
			}
		}

		System.out.println("가장 큰 값 : " + max1);
		System.out.println("가장 작은 값 : " + min1);

	}

}
