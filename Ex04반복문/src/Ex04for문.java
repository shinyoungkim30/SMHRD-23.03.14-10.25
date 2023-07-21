import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 자기보다 큰 수를 약수로 가지고 있지 않음
		// 2. 모든 숫자들의 가장 작은 약수는 1
		// 예) 32의 약수 : 1 2 4 8 16 32
		// 예) 24의 약수 : 1 2 3 4 6 8 12 24
		// 자기자신의 절반~자기자신 사이에 약수는 존재하지 않는다

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		System.out.print(input + "의 약수 : ");
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
