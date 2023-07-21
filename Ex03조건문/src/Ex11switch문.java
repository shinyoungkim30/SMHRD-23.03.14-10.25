import java.util.Scanner;

public class Ex11switch문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		
		System.out.println("--메뉴--");
		
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int myChoice = sc.nextInt();
		
		switch(myChoice) {
		case 1:
			if ((money-1800)>0) {
				System.out.print("잔돈 : " + (money - 1800) + "원\n");
				System.out.print("천원 : " + (money-1800)/1000 + "\n");				
				System.out.print("오백원 : " + ((money-1800)%1000)/500 + "\n");				
				System.out.print("백원 : " + (((money-1800)%1000)%500)/100 + "\n");				
			} else {
				System.out.println("돈이 부족해요 ㅠㅡㅠ");
			}
			break;
		case 2:
			if ((money-2000)>0) {
				System.out.print("잔돈 : " + (money - 2000) + "원\n");
				System.out.print("천원 : " + (money-2000)/1000 + "\n");				
				System.out.print("오백원 : " + ((money-2000)%1000)/500 + "\n");				
				System.out.print("백원 : " + (((money-2000)%1000)%500)/100 + "\n");
			} else {
				System.out.println("돈이 부족해요 ㅠㅡㅠ");
			}
			break;
		case 3:
			if ((money-1200)>0) {
				System.out.print("잔돈 : " + (money - 1200) + "원\n");
				System.out.print("천원 : " + (money-1200)/1000 + "\n");				
				System.out.print("오백원 : " + ((money-1200)%1000)/500 + "\n");				
				System.out.print("백원 : " + (((money-1200)%1000)%500)/100 + "\n");
			} else {
				System.out.println("돈이 부족해요 ㅠㅡㅠ");
			}
			break;
		default :
			System.out.println("돈이 부족해요 ㅠㅡㅠ");
		}		

	}

}
