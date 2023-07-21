package 변수;

public class Ex03자료형과형변환 {

	public static void main(String[] args) {
		// 1. 논리형 (참, 거짓, 1, 0, true, false)
		boolean sw = true; // 참
		boolean sw1 = false; // 거짓
		
		// 2. 문자형 : 문자 1개만 저장 가능
		char c = 'a';
		//char c2 = 'abc';
		char c2 = 75; // 'K' 아스키코드 75는 K
		
		// 3. 정수형
		// -1 byte (1byte)
		byte num = 120; // int 120 -> byte에 저장하겠다 (자료형을 바꾸겠다 -> 형변환)
		// -2 short (2byte)
		short num2 = 200;
		// -3 int (4byte) : 기본 정수형 자료형
		int num3 = 200;
		// -4 long (8byte)
		long num4 = 300; // 자동형변환
		
		// 4. 실수형 (부동소수점 -> 오차, 고정소수점 -> 범위가 제한적)
		// -1 float (4byte)
		float num5 = (float)3.14;
		float num6 = 3.14f;
		// -2 double (8byte) : 기본 실수형 자료형
		double num7 = 3.14;
		

	}

}
