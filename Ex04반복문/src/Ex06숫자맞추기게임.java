import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임 {

	public static void main(String[] args) {
		// 1. 기능들 가져오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// Ctrl + Shift + O : 한꺼번에 import 단축키

		// 2. 출력문 -> 1번만
		System.out.println("======1부터 100 사이 숫자 맞추기 게임======");
		// 랜덤한 숫자 한개 -> 답
		int answer = rd.nextInt(100) + 1;

		while (true) {
			// 반복이 되어지는 부분
			// 3. 출력문 : 입력
			System.out.print("1과 100 사이의 정수를 입력하세요 >> ");
			int num = sc.nextInt();
			// 입력한 값이 랜덤 숫자와 일치하는지 판단
			if (num == answer) {
				System.out.println("정답입니다.");
				break;
			} else if (num > answer) {
				System.out.println("더 작은 수로 다시 시도 해보세요");
			} else {
				System.out.println("더 큰 수로 다시 시도 해보세요");
			}
		}

//		내가 작성했던 코드

//		System.out.println("======1부터 100 사이 숫자 맞추기 게임======");
//
//		int num = rd.nextInt(99) + 1;
//
//		while (true) {
//			System.out.print("1과 100 사이의 정수를 입력하세요 >> ");
//			int input = sc.nextInt();
//
//			if (input > num) {
//				System.out.println("더 작은 수로 다시 시도 해보세요");
//			} else if (input < num) {
//				System.out.println("더 큰 수로 다시 시도 해보세요");
//			} else {
//				break;
//			}
//		}
//		System.out.println(num + " 정답입니다!!");

	}

}
