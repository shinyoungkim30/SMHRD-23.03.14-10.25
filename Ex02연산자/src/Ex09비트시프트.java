
public class Ex09비트시프트 {

	public static void main(String[] args) {
		
//		비트연산자, 시프트연산자 -> 연산을 빠르게 하고싶을 때 (예:은행)
		int a = 9; // 10진수 -> 2진수
		
//		비트연산 : & (and) |(or) ^(xor) ~(not)
		int b = 9; // 1001
		int c = 11; // 1011
//		같은자리수가 하나라도 0이면 false(0)
		System.out.println(b&c);
//		같은자리수가 하나라도 1이면 true(1)
		System.out.println(b|c);
//		같은자리수가 같으면 false(0) 다르면 true(1)
		System.out.println(b^c);
		
		int d = 6; //0110
		System.out.println(~d);
		
//		시프트 연산 : 비트(0, 1)를 옮겨주는 연산
//		<<(비트가 왼쪽으로 옮겨짐), >>(비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2);
//		3(2진수) 비트를 왼쪽으로 2칸씩 움직인다

	}

}
