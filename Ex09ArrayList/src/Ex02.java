import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		// 기본타입은 <> 지정할 수 없음
		// <Reference Type>
		// int -> Integer (int -> Class(Reference) 타입)
		// boolean -> Boolean
		// char -> Character
		ArrayList<Integer> al = new ArrayList<Integer>(7);
		
		al.add(2); // 0번 인덱스에 2라는 값을 넣겠다

	}

}
