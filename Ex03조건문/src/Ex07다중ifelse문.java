import java.util.Scanner;

public class Ex07다중ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A, B, C 중 하나 입력 : ");
		String alpha = sc.next();
		
//		==는 기본 타입(primitive) 비교시에만 사용
//		if(alpha=="A") {
//			System.out.println("A입력");
//		}else if(alpha=="B") {
//			System.out.println("B입력");
//		}else if(alpha=="C") {
//			System.out.println("C입력");
//		}else {
//			System.out.println("A, B, C중에 입력해주세요");
//		}

//		reference타입은 비교하는 기능이 따로 있음
//		String -> 비교할 때는 .equals() 메서드를 사용해야함
//		결과값(반환값)이 true/false (boolean)
//		if절의 조건으로 사용 가능
		if(alpha.equals("A")) {
			System.out.println("A입력");
		}else if(alpha.equals("B")) {
			System.out.println("B입력");
		}else if(alpha.equals("C")) {
			System.out.println("C입력");
		}else {
			System.out.println("A, B, C중에 입력해주세요");
		}

	}

}
