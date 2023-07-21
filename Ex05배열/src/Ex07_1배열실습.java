import java.util.Scanner;

public class Ex07_1배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] answer = { 1, 4, 3, 2, 1 };
		int[] userAnswer = new int[5];

		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		int score = 0;
		String check = "";

		for (int i = 0; i < userAnswer.length; i++) {
			System.out.print(i + 1 + "번 답 >> ");
			userAnswer[i] = sc.nextInt();

			if (answer[i] == userAnswer[i]) {
				check += "O ";
				score += 20;
			} else {
				check += "X ";
			}
		}

		System.out.println("정답확인");
		System.out.println(check);
		System.out.println("총 점 : " + score);

	}

}
