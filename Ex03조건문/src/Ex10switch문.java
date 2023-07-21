import java.util.Scanner;

public class Ex10switch문 {

	public static void main(String[] args) {
//		String 형 변수 data를 선언하고 키보드로 값을 입력받으시오.
//		switch~case 문을 사용하여 입력받은 값이 “한국어” 이면 “안녕하세요”,
//		“영어”이면 “헬로”, “중국어”이면 “니하오”, “일본어”이면 “곤니찌와”를
//		출력하고 그 외 다른 단어를 입력할 경우에는 “다른 값 입력”을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String data = sc.next();
		
		switch(data) {
		case "한국어":
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로");
			break;
		case "중국어":
			System.out.println("니하오");
			break;
		case "일본어":
			System.out.println("곤니찌와");
			break;
		default :
			System.out.println("다른 값 입력");
		}
		
		
//		월(1~12)을 입력받아 해당 월이 봄,여름,가을,겨울 중
//		어느 계절인지 출력하시오.
//		(1,2,12월 -> 겨울 / 3,4,5월 -> 봄 /
//		6,7,8월 -> 여름 / 9/10/11월 -> 가을)
		
		System.out.print("월(1~12) 입력 : ");
		int month = sc.nextInt();
		
		// java 15 이상부터는 case 1,2,12 : <- 가능
		switch(month) {
		case 12:
		case 1:			
		case 2:
			System.out.println(month+"월은 겨울입니다");
			break;
		case 3:
		case 4:			
		case 5:
			System.out.println(month+"월은 봄입니다");
			break;
		case 6:			
		case 7:			
		case 8:
			System.out.println(month+"월은 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"월은 가을입니다");
			break;
			
		}

	}

}
