package 이중for문;

public class Ex04별찍기 {

	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
