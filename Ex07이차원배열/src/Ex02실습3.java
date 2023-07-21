import java.lang.reflect.Array;

public class Ex02실습3 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

//		[0][0] = 5
//		[0][1] = 4
//		[0][2] = 3
//		[0][3] = 2
//		[0][4] = 1
//		
//		for (int j = 0; j<arr[i].length; j++) {
//			array[0][j] = 5-j;
//		}
//		
//		[1][0] = 10
//		[1][1] = 9
//		[1][2] = 8
//		[1][3] = 7
//		[1][4] = 6

		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j < arr[i - 1].length; j++) {
				arr[i - 1][j] = 5 * i - j;
			}
		}
		
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j < arr[i - 1].length; j++) {
				System.out.print(arr[i - 1][j] + "\t");
			}
			System.out.println();
		}

	}

}
