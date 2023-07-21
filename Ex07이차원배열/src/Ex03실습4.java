
public class Ex03실습4 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num++;
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][4 - j] = num++;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

		}
	}
}
