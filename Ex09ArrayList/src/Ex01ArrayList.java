import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		// 1. ArrayList 생성 -> heap
		// ArrayList 생성된 참조값 저장 -> 참조변수(레퍼런스 변수) 선언
		ArrayList<String> al = new ArrayList<String>();
		// ArrayList<E>(초기 크기->생략가능, 기본값 10);

		// 2. 요소 삽입
		al.add("Hello"); // ArrayList의 0번
		al.add("Hi"); // 1번
		al.add("Java"); // 2번

		// 3. 요소 개수
		System.out.println(al.size()); // 3

		// 4. 요소 중간 삽입
		al.add(1, "Python");
		System.out.println(al.size());

		// 5. 특정 인덱스에 있는 요소 알아내기
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
//		System.out.println(al.get(4)); 실행하면 오류

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// 확장 for문 (for~each문)
		for (String s : al) {
			System.out.println(s);
		}

		// 6. 특정 요소 삭제
		String a = al.remove(2);
		System.out.println(al.size());

//		al.remove(3); 실행하면 오류

		// 7. 모든 요소 삭제
		al.clear();
		System.out.println(al.size());

	}

}
