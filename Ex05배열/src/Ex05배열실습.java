import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 크기가 5인 정수형 데이터를 저장할 수 있는 배열생성
		// 그 배열의 참조값(주소값)을 저장할 레퍼런스 변수 선언
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			score[i] = sc.nextInt();
		}

		System.out.print("입력된 점수 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();

		// 확장 for문 (for~each문)
		// 배열, List 구조에서 쓰일 수 있는 반복문
		// for(배열의 0번 인덱스에 있는 값부터 임시로 저장할 변수:배열의 레퍼런스 변수 이름)
//		for (int a : score) {
//			System.out.print(a + " ");
//		}

		int max = score[0];
		int min = score[0];
		int sum = 0;

		for (int a : score) {
			sum += a;
			
			if (max < a) {
				max = a;
			}
			if (min > a) {
				min = a;
			}
		}
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		System.out.println("총 합 : " + sum);
		System.out.printf("평균 : %.2f", sum/(double)score.length);

		// -----------------------------------
		// 내가 작성했던 코드

//		System.out.print("1번째 입력 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("2번째 입력 >> ");
//		int num2 = sc.nextInt();
//		System.out.print("3번째 입력 >> ");
//		int num3 = sc.nextInt();
//		System.out.print("4번째 입력 >> ");
//		int num4 = sc.nextInt();
//		System.out.print("5번째 입력 >> ");
//		int num5 = sc.nextInt();
//
//		int[] array = { num1, num2, num3, num4, num5 };
//
//		System.out.print("입력된 점수 : ");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println();
//
//		int max = array[0];
//		int min = array[0];
//
//		for (int i = 1; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			} else if (array[i] < min) {
//				min = array[i];
//			}
//		}
//		System.out.println("최고 점수 : " + max);
//		System.out.println("최저 점수 : " + min);
//
//		int sum = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		System.out.print("총 합 : " + sum);
//		System.out.println();
//
//		double avg = (double) sum / array.length;
//
//		System.out.print("평균 : " + avg);

	}

}
