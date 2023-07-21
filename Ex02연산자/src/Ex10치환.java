
public class Ex10치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		
//		내가 작성했던 코드
//		String table = right;
//		right = left;
//		left = table;
		
		String temp; // 임시 저장공간 선언만 한것, 초기화X
		String temp1 = null; // 변수를 초기화함 -> 레퍼런스 타입만 가능
//		int temp2 = null; -> 기본타입은 null로 초기화 할 수 없다
		temp = right; // left:red, temp:blue, right:blue
		right = left; // left:red, temp:blue, right:red
		left = temp; // left:blue, temp:blue, right:red
		
		System.out.println(left); // blue
		System.out.println(right); // red
		
		
		

	}

}
