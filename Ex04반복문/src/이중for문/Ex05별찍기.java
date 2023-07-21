package 이중for문;

public class Ex05별찍기 {

	public static void main(String[] args) {
		
		for (int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
