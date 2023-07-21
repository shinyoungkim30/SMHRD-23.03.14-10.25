package 메서드;

public class Ex01메서드 {

	public static void main(String[] args) {

		// 매개변수와 전달인자의 갯수, 데이터 타입은 항상 일치

		System.out.println(sum(10, 20, 500));
		System.out.println(sum(20, 25, 500));
		System.out.println(sum(1, 25, 500));
		System.out.println(sum(2, 40, 500));
		System.out.println(sum(3, 60, 500));

	}

	// 메서드 작성은 main 밖에서 이루어진다
	// +하는 기능을 그냥 만들어놓고 필요할 때마다 가져다가 사용해야지
	// public : 접근제한자 (공공의 : 클래스 내/외부에서 마음대로 접근이 가능하도록 해줌)
	// static : 저장소
	// 리턴타입 : 돌려받는 결과값의 데이터 타입
	// 리턴타입이 있으면(자료형) : return 값 존재 / 없으면(void) return x --> 기능자체
	// 메서드명(호출명) : 실행시킬때 부를 이름
	// (매개변수) : 메서드 안에서 사용될 수 있는 변수, 선언만 한다
	// 소괄호 안쪽에 매개변수(메서드 안에서 사용되는 변수, main에서 받아온 전달인자)
	// 전달인자, 매개변수는 개수, 자료형이 같아야 한다

	public static int sum(int a, int b, int c) {
		// 리턴타입에 자료형이 명시되어 있으면 return 이라는 키워드가 따라온다
		// 모든 경우에 대해서 꼭 return 값이 있어야 한다

		int result = a + b + c;

		return result + 365;
	}

}
