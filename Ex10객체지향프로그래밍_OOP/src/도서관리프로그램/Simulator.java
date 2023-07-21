package 도서관리프로그램;

import java.util.Scanner;

// 사용자와 상호소통하는 인터페이스 역할(결과 출력, 입력 등)
public class Simulator {

	public static void main(String[] args) {

		System.out.println("===도서관리 시스템===");

		Scanner sc = new Scanner(System.in);

		BookSystem bookManager = new BookSystem();

		while (true) {
			System.out.println("[1]등록 [2]전체조회 [3]종료");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("책 이름 : ");
				String title = sc.next();
				System.out.println("책 가격 : ");
				int pricate = sc.nextInt();
				System.out.println("책 저자 : ");
				String writer = sc.next();
				bookManager.addBook(title, pricate, writer);

			} else if (choice == 2) {
				String msg = bookManager.getBookTitleList();
				System.out.println(msg);
			} else if (choice == 3) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력하세요.");
			}
		}

	}

}
