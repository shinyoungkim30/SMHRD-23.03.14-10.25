import java.util.Scanner;

public class Ex06삼항연산 {

	public static void main(String[] args) {

//		Ctrl + Shift + F : 자동 정렬
		

		// 두 개의 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과값을 출력하세요.

		Scanner sc = new Scanner(System.in);

//		System.out.print("첫번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		
//		int result = num1 > num2 ? num1 - num2 : num2 - num1;//		
//		
//		System.out.println("두 수의 차 : " + result);

//		또 다른 방법
//		int result = num1 - num2;
//		System.out.println(result>=0 ? result : -result);
		

//		농구공을 담기 위해 필요한 상자의 개수를 구하세요. 
//		상자 하나에는 농구공이 5개 들어갈 수 있습니다. 
//		만일 농구공이 '23'개 라면 필요한 상자의 개수는 '5'개 입니다.

//		System.out.print("농구공의 개수를 입력하세요 : ");
//		int ball = sc.nextInt();
//		
//		int box = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;
//		
//		System.out.println("필요한 상자의 수 : " + box);
		

//		시급계산기 입니다. 기본시급은 9,000원이고
//		8시간이 넘을 경우 초과시간은 시급의 1.5배를 책정해줍니다.

		System.out.print("노동시간을 입력하세요 : ");
		int workTime = sc.nextInt();

//		실수 -> 정수 형변환 절대 자동형변환 해주지 않음
//		같은 크기더라도 실수가 표현범위가 더 넒기 때문에
		
		int 기본시급 = 9000;
		double pay = workTime <= 8 ? workTime * 기본시급 : (기본시급 * 8) + (workTime - 8) * (기본시급 * 1.5);

//		System.out.println("총 임금은 " + pay + "원 입니다");
		System.out.printf("총 임금은 %.0f원 입니다", pay);

	}

}
