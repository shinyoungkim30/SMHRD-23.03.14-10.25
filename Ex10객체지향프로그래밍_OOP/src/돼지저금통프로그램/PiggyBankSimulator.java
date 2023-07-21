package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		
		System.out.println("===돼지 저금통===");

		PiggyBank pi = new PiggyBank(20000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금할 금액 입력 : ");
		int inputMoney = sc.nextInt();

		pi.deposit(inputMoney);
		pi.deposit(inputMoney);
		
		System.out.print("입금할 금액 입력 : ");
		int inputMoney2 = sc.nextInt();

		pi.withdraw(inputMoney2);

		int m = pi.showMoney();
		System.out.println(m + "원 남았습니다.");

//		Scanner sc = new Scanner(System.in);
//
//	      PiggyBank pb = new PiggyBank();
//
//	      int memu = 0;
//
//	      while (true) {
//	         System.out.print("[1]입금 [2]출금 [3]잔액확인 [4]종료");
//	         menu = sc.nextInt();
//	         if (menu == 1) {
//	            System.out.print("금액을 입력하세요 : ");
//	            pb.deposit(sc.nextInt());
//	            pb.showMoney();
//	         } else if (menu == 2) {
//	            System.out.print("금액을 입력하세요 : ");
//	            pb.withdraw(sc.nextInt());
//	            pb.showMoney();
//	         } else if (menu == 3) {
//	            pb.showMoney();
//	         } else {
//	            System.out.println("종료합니다");
//	            break;
//	         }
//	      }

	}

}
