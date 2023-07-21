import java.util.Scanner;

public class Ex05실습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] score = new int[4][];

		score[0] = new int[3];
		score[1] = new int[5];
		score[2] = new int[4];
		score[3] = new int[6];

		int sum = 0;
		
		for (int j = 0; j < score.length; j++) {
			System.out.println((j + 1) + "반 점수 입력");

			for (int i = 0; i < score[j].length; i++) {
				System.out.print((j + 1) + "반 " + (i + 1) + "번째 학생 점수 >> ");
				score[j][i] = sc.nextInt();
			}
		}

		for (int j = 0; j < score.length; j++) {
			System.out.print((j + 1) + "반 >> ");

			for (int i = 0; i < score[j].length; i++) {
				System.out.print(score[j][i] + " ");
				sum += score[j][i];
			}
			System.out.println();
			System.out.print("총점 : " + sum + " ");
			System.out.printf("평균 : %.2f" , 1.0*sum/score[j].length);
			System.out.println();
			sum = 0;
		}

	}

}
