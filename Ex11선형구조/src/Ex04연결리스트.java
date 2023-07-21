import java.util.LinkedList;

public class Ex04연결리스트 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addFirst(1); // 가장 앞에 데이터 추가
		list.addLast(2); // 가장 뒤에 데이터 추가
		list.add(1, 5); // 1번 인덱스에 5 추가
		
		// 1 5 2
		for(Integer i:list) {
			System.out.println(i);
		}
		
		System.out.println(list.get(1));
		
		list.removeFirst(); // 가장 앞에 데이터 삭제
		list.removeLast(); // 가장 뒤에 데이터 삭제
		list.remove(0); // index 0번 데이터 삭제
		list.remove(); // 괄호 안 비워둘 경우 index 0번 데이터 삭제
		
		list.clear(); // 모든 값 제거
		
		System.out.println(list.size()); // 요소 개수

	}

}
