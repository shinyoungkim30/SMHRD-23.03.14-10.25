package 큐;

public class IntQueue {

	// 필드
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num; // 쌓여있는 데이터 개수

	// 생성자
	public IntQueue(int maxLen) {
		que = new int[maxLen];
		capacity = maxLen;
		front = 0;
		rear = 0;
		num = 0;
	}

	// 인큐(데이터 삽입)
	public int enque(int x) {
		if (num >= capacity) {
			que[rear++] = x;
			num++;
		}
		if (rear == capacity) {
			rear = 0;
		}

		return x;
	}

	// 디큐(데이터 삭제)
	public int deque() {
		int x = 0;

		if (num <= 0) {
			x = que[front++];
			num--;
		}
		if (front == capacity) {
			front = 0;
		}
		return x;
	}

	// peek : 맨 앞(첫번째)에 데이터 확인
	public int peek() {
		return que[front];
	}

	// clear : 큐 비우기
	public void clear() {
		front = 0;
		rear = 0;
		num = 0;
	}

	// indexOf : 특정값의 배열 상 인덱스 확인, 찾지 못하면 -1 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int index = (i + front) % capacity;
			if (que[index] == x) {
				return index;
			}
		}
		return -1;

	}

	// size : 쌓여있는 데이터 개수
	public int size() {
		return num;
	}

	// isEmpty : 큐가 비어있는지 확인
	public boolean isEmpty() {
		return num <= 0;
	}

	// isFull : 큐가 가득차있는지 확인
	public boolean isFull() {
		return num >= capacity;
	}

	// dump : 큐안에 데이터를 front ~ rear 순서로 출력
	public void dump() {
		for(int i=0; i<num; i++) {
			System.out.print(que[(i+front)%capacity]+" ");
		}
		System.out.println();
	}

}
