package 이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {

		// 패키지를 구분하는 이유 : 협업을 위해서
		// 하나의 프로젝트 안에서 클래스 이름 중복가능

		for (int j = 2; j <= 9; j++) {
			
			System.out.print(j + "단 : ");
			
			for (int i = 1; i <= 9; i++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}
			
			System.out.println();
		}
		
		// 지역변수 vs 전역변수
		// 지역변수 : 특정 영역(scope)에서만 사용할 수 있는 변수
		// 전역변수 : 클래스 전체에서 사용할 수 있는 변수
		// 특정영역을 구분하는 방법 {영역}

	}

}
