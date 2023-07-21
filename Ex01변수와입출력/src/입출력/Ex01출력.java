package 입출력;

public class Ex01출력 {

	public static void main(String[] args) {
		
		// ctrl + s : 코드 저장
		// ctrl + F11 : 코드 실행
		
		// System : 표준 입출력 클래스
		// System.out : 출력 기능 사용
		
		int a = 10;
		// a -> 변수, 상수 (값을 저장)
		
		// print() -> 메서드 (기능)
		// ~~를 출력하겠다 기능
		System.out.print(123);
		System.out.print("Hello World!\n"); // \n : 개행
		
		// println() : 출력후 개행
		System.out.println("출력구문1");
		// syso + ctrl + space
		System.out.println("출력구문2");
		// ctrl + alt + 위, 아래 방향키 : 해당 구문 복사 붙여넣기
		System.out.println("출력구문3");
		
		// printf() : 특정 형식으로 출력
		// 1. pi = 3.14
		int a1 = 1;
		String b = "pi";
		double c = 3.14;
		
		// %d : 정수자리, %s : 문자열 자리, %f : 실수자리
		System.out.printf("%d. %s = %f\n",a1, b, c);
		System.out.printf("%d. %s = %f",2, "pi", 3.14);
		
		String s1 = "제 이름은 ";
		String s2 = "김신영입니다.";
		
		System.out.print(s1);
		System.out.print(s2);
		
		System.out.print(s1+s2+1); // 문자열은 + 연산 가능
		
	

	}

}
