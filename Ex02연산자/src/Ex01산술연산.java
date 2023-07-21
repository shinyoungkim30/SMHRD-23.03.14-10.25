
public class Ex01산술연산 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;
		
		// 정수와 정수 연산시에는 무조건 결과는 정수로 나온다
		System.out.println(num1/num2);
		// 실수와 실수 연산시에는 무조건 결과는 실수로 나온다
		// 실수 연산시에는 부동소수점으로 오차가 있을 수 있다
		System.out.println(num3/num4);
		// 정수와 실수 연산시에는 무조건 결과는 실수로 나온다
		System.out.println(num1/num4);
		
		System.out.println(num3%num4);
		
		
		//더하기 연산에 문자열이 섞여있으면 숫자가 자동으로 문자가 된다		
		int num5 = 7;
		int num6 = 3;
		
		// 더하기
		System.out.println("더한 결과 : " + (num5 + num6));
		// 빼기
		System.out.println("뺀 결과 : " + (num5-num6));
		// 곱하기
		System.out.println("곱한 결과 : " + num5 * num6);
		// 나누기
		System.out.println("나눈 결과 : " + (double)num5 / num6);
		

	}

}
