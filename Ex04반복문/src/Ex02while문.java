import java.util.Scanner;

public class Ex02while문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = 0;

		while (input < 10) {
			input = sc.nextInt();
		}

		System.out.println("while문 탈출");

		do {
			input = sc.nextInt();
		} while (input < 10);

		while (true) {
			input = sc.nextInt();

			if (input >= 10) {
				break;
			}
		}
		System.out.println("while(true)문 탈출");

	}

}
