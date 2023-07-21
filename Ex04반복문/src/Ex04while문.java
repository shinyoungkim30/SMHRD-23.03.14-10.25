import java.util.Scanner;

public class Ex04while문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int currentWeight = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int targetWeight = sc.nextInt();

		int week = 1;

		while (true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int inputWeight = sc.nextInt();
			currentWeight -= inputWeight;
			week++;

			if (currentWeight <= targetWeight) {
				break;
			}
		}
		System.out.println("최종몸무게 : " + currentWeight);
		System.out.println("축하합니다");

//		System.out.print("현재 몸무게 : ");
//		int currentWeight = sc.nextInt();
//
//		System.out.print("목표 몸무게 : ");
//		int targetWeight = sc.nextInt();
//
//		System.out.print("1주차 감량 몸무게 : ");
//		int inputWeek1Weight = sc.nextInt();
//		int week1Result = currentWeight - inputWeek1Weight;
//		System.out.println("현재 몸무게 : " + week1Result);
//
//		System.out.print("2주차 감량 몸무게 : ");
//		int inputWeek2Weight = sc.nextInt();
//		int week2Result = week1Result - inputWeek2Weight;
//		System.out.println("현재 몸무게 : " + week2Result);
//
//		System.out.print("3주차 감량 몸무게 : ");
//		int inputWeek3Weight = sc.nextInt();
//		int week3Result = week2Result - inputWeek3Weight;
//		System.out.println("현재 몸무게 : " + week3Result);
//
//		System.out.print("4주차 감량 몸무게 : ");
//		int inputWeek4Weight = sc.nextInt();
//		int week4Result = week3Result - inputWeek4Weight;
//		System.out.println("현재 몸무게 : " + week4Result);
//
//		System.out.print("5주차 감량 몸무게 : ");
//		int inputWeek5Weight = sc.nextInt();
//		int week5Result = week4Result - inputWeek5Weight;
//		System.out.println("최종 몸무게 : " + week5Result);
//
//		if (week5Result <= targetWeight) {
//			System.out.println("축하합니다");
//		}

	}

}
