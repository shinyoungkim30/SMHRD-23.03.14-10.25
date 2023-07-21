import java.util.Scanner;

public class Ex08for문 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(input * i + " ");
		}

	}

}
