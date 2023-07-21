package 메서드;

public class Ex06메서드 {

	public static void main(String[] args) {

		// main안에 코드는 손대지 않기
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	public static void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	public static void sub(int a, int b) {
		int result = a - b;
		System.out.println(result);
	}

	public static void mul(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}

	public static void div(int a, int b) {
		int result = a / b;
		System.out.println(result);
	}

}
