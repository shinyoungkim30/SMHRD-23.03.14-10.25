
public class Ex03배열실습 {

	public static void main(String[] args) {

		// 1. 크기가 10인 배열 생성, 원하는 값으로 초기화
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		// 2. 배열의 값 중 홀수만 출력, 홀수가 몇개인지 출력
		int num = 0;

		System.out.print("배열 홀수 : ");

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				num += 1;
			}
		}
		System.out.println();
		System.out.println("총 개수 : " + num + "개");

	}

}
