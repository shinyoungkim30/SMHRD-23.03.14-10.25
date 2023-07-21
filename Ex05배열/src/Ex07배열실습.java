import java.util.Scanner;

public class Ex07배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		int[] answer = { 1, 4, 3, 2, 1 };
		int score = 0;
		String[] check = new String[5];

		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		for (int i = 0; i < answer.length; i++) {
			System.out.print((i + 1) + "번 답 >> ");
			if (answer[i] == sc.nextInt()) {
				check[i] = "O";
				score += 20;
			} else {
				check[i] = "X";
			}
		}
		System.out.println("정답확인");

		for (int i = 0; i < check.length; i++) {
			System.out.print(check[i] + " ");
		}
		System.out.println("총 점 : " + score);

	}

}
