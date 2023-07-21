import java.util.Scanner;

public class Ex05_1실습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] score = new int[4][]; // 전체 성적
		score[0] = new int[3]; // 1반
		score[1] = new int[5]; // 2반
		score[2] = new int[4]; // 3반
		score[3] = new int[6]; // 4반

		// 점수 입력
		for (int i = 0; i < score.length; i++) {

			System.out.println(i + 1 + "반 점수 입력");

			for (int j = 0; j < score[i].length; j++) {

				System.out.print(i + 1 + "반 " + (j + 1) + "번째 학생 점수 ");

				score[i][j] = sc.nextInt();
			}
		}

		int sum;

		// 점수 출력
		for (int i = 0; i < score.length; i++) {

			System.out.print(i + 1 + "반 >> ");

			sum = 0; // 0으로 초기화

			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + " ");

				sum += score[i][j];
			}
			System.out.println();
			System.out.println("총 점 : " + sum + " 평균 : " + (sum / (double) score[i].length));

		}

	}

}
