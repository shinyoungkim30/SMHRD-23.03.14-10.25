import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		
//		1. 랜덤, 입력하는 도구 가져오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
//		2. 출력문 --> 한번만
		System.out.println("===PLUS GAME===");
		
		// 틀린 횟수 저장하는 변수
		int cnt = 0;
		
		while(true) {
//			3. 랜덤한 숫자 2개를 가져온다
			int num1 = rd.nextInt(50)+1;
			int num2 = rd.nextInt(50)+1;
//			출력 4 + 8 =
			System.out.print(num1+"+"+num2+"=");
//			답을 입력받는다
			int answer = sc.nextInt();
//			입력한 답 == 실제 답 ---> S/F
			if(answer == num1 + num2) {
				System.out.println("success");
			} else {
				cnt++;
				if(cnt > 2) {
					break;
				}
				// 틀렸다 ---> 틀린횟수 + 1
				System.out.println("fail");
				System.out.print("계속 하시겠습니까? >> ");
				String answer2 = sc.next();
				if(answer2.equals("N")) {
					break;
				}
			}
			
		}
			
//		
//		s ---> while문 처음으로 돌아간다
//		f ---> 사용자한테 계속할건지 물어본다
//		사용자가 N/Y를 입력한다
//		Y : while문 처음으로 돌아간다
//		n : break;
		
		
		

		
//		-----------------------------------------------
//		내가 작성했던 코드
//		Random rd = new Random();
//		Scanner sc = new Scanner(System.in);
//
//		int num1 = 0;
//		int num2 = 0;
//
//		int failNum = 0;
//
//		System.out.println(".  ♡ ∩_∩\r\n" + "  （„• ֊ •„)♡\r\n" + " ┏━∪∪━━━━┓\r\n" + " ♡ PLUS GAME START! ♡\r\n"
//				+ " ┗━━━━━━┛\r\n" + "");
//
//		while (true) {
//			num1 = rd.nextInt(50) + 1;
//			num2 = rd.nextInt(50) + 1;
//
//			System.out.print(num1 + "+" + num2 + "=");
//			int answer = sc.nextInt();
//
//			if (answer == num1 + num2) {
//				System.out.println("˚✧₊⁎ SUCCESS ⁎⁺˳✧˚");
//			} else {
//				System.out.println("(̅_̅_̅(̲̲̲̲̲̅̅̅̅̅̅(̅_̅_̲̲̲̅̅̅FAIL_̅_̅_̅() ڪے");
//				failNum += 1;
//				if (failNum == 3) {
//					break;
//				}
//				System.out.print(
//						". ∧_∧\r\n" + "( ´･ω･)∧∧\r\n" + "./⌒ ,つ⌒ヽ) 토닥토닥\r\n" + "(___ (＿＿)\r\n" + "계속 하시겠습니까? (Y/N) ");
//				String userChoice = sc.next();
//				if (userChoice.equals("N")) {
//					break;
//				}
//			}
//		}
//		System.out.println("₊    ˚   ✩    ｡˚      ˚ ☽\r\n" + "˚  ₊        /) /)   ₊   ✩    ｡\r\n"
//				+ "˚    ✩  ( •̥ ˕ •̥)     ｡  ˚\r\n" + "  ₊˚｡    c(“)(“)   ₊ ˚ ✩\r\n"
//				+ "‘’’’’ꕤ’’’’’’’’’’’’’’ꕤ’’’’’’’’’\r\n" + " ꕤ         ꕤ          ꕤ\r\n" + "GAME OVER");
	}

}
