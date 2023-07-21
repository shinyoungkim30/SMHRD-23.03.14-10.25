package 메서드;

public class Ex14메서드 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));

	}

	public static String getMiddle(String a) {

		// 글자 수가 짝수개이면 2개 리턴
		// a.length() : 문자열의 길이를 알수가 있음
		// 글자의 위치는 만약에 6글자면 3,4위치해 있는 글자가 return
		// 글자수가 홀수이면 1개 리턴
		// 글자의 위치가 만약에 5글자면 3위치해 있는 글자가 return

//		if (a.length() % 2 == 0) {
//			return a.substring(a.length() / 2 - 1, a.length() / 2 + 1);
//		} else {
//			return a.substring(a.length() / 2, a.length() / 2 + 1);
//		}
		int len = a.length() / 2;
		
		if (a.length() % 2 == 0) {
			return "" + a.charAt(len - 1) + a.charAt(len);
		} else {
			return "" + a.charAt(len);
		}
	}

}
