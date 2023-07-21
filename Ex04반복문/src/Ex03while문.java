import java.util.Scanner;

public class Ex03while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		내가 작성했던 코드
//		int input = 0;
//		int sum = 0;		
//		
//		while(input>=0) {
//			System.out.print("숫자 입력 : ");
//			input = sc.nextInt();
//			
//			if(input>0) {
//				sum += input;
//			}
//			
//		}
//		System.out.println("누적결과 : " + sum);
		
		int input = 0;
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		while(true) {
			input = sc.nextInt();
			
			if(input==-1) {
				break;
			}
			
			if(input%2==1) {
				++odd;
			}else {
				++even;
			}
			
			sum += input;
		}
		System.out.println("누적결과 : " + sum);
	}

}
