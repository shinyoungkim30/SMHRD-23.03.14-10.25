package 링크드리스트;

public class Node {

	// 실제 데이터
	private String data;
	// 다음 노드의 참조값(주소값)
	private Node next;

	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
