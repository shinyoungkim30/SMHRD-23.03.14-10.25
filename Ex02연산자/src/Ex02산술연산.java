
public class Ex02산술연산 {

	public static void main(String[] args) {
		
		int num = 456;
		
		// 백의 자리 아래를 버린 결과를 출력하는 코드를 작성하세요.
		System.out.println("결과 확인 : " + (num / 100) * 100);
		System.out.println("결과 확인 : " + (num - (num % 100)));
		// 일의 자리를 1로 바꾸는 코드를 작성하세요.
		System.out.println("결과 확인 : " + (((num / 10) * 10) + 1));
		System.out.println("결과 확인 : " + (num - ((num % 10) - 1)));

	}

}
