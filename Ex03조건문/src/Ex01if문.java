import java.util.Scanner;

public class Ex01if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
//		입력한 나이가 20이상이니
//		참(true) -> "성인입니다"
//		거짓(false) -> 아무행동도 취하지 않을것
		
//		if(조건식 : 결과값이 true or false (boolean))
//		----> 비교연산자, 논리연산자
		if(age >= 20) {
			//조건식의 결과가 참(true)일때
			System.out.println("성인입니다");
		}
		
		System.out.println("맨아랫줄");
		
//		dead code : 절대 실행 안되는 코드(의미가 없는 코드)
		if(false) {
			System.out.println("!");
		}
		
		
		

	}

}
