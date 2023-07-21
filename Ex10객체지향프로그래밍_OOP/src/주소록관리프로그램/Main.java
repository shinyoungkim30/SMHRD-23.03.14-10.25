package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addr = new ArrayList<>();

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();

				Address a = new Address(name, age, phoneNumber);
				addr.add(a);
			} else if (select == 2) {
				if (addr.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				for (int i = 0; i < addr.size(); i++) {
					System.out.print(i + 1 + ". ");
					System.out.print(addr.get(i).getName() + "(" + addr.get(i).getAge() + "세) : "
							+ addr.get(i).getPhoneNumber());
					System.out.println();
				}
			} else if (select == 3) {
				if (addr.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					System.out.print("삭제할 번호 입력 : ");
					int num = sc.nextInt();
					addr.remove(num - 1);
				}
			} else if (select == 4) {
				System.out.print("검색할 이름 입력 : ");
				String name = sc.next();
				int index = -1;
				for (int i = 0; i < addr.size(); i++) {
					if (name.equals(addr.get(i).getName())) {
						index = i;
					}
				}
				if (index == -1) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				} else {
					System.out.print(index + 1 + ". ");
					System.out.print(addr.get(index).getName() + "(" + addr.get(index).getAge() + "세) : "
							+ addr.get(index).getPhoneNumber());
					System.out.println();
				}
			} else if (select == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
			}
		}

//		ArrayList<Address> a = new ArrayList<>();
//
//		int menu;
//		String name;
//		int age;
//		String phoneNumber;
//		int userDeleteNum;
//
//		while (true) {
//			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 ");
//			menu = sc.nextInt();
//
//			if (menu == 1) {
//				System.out.print("이름 : ");
//				name = sc.next();
//				System.out.print("나이 : ");
//				age = sc.nextInt();
//				System.out.print("전화번호 : ");
//				phoneNumber = sc.next();
//
//				Address ad = new Address(name, age, phoneNumber);
//				a.add(ad);
//				System.out.println();
//
//			} else if (menu == 2) {
//				if (a.size() == 0) {
//					System.out.println("등록된 연락처가 없습니다.\n");
//				} else {
//					for (int i = 0; i < a.size(); i++) {
//						System.out.print(i + 1 + ". " + a.get(i).getName() + "(" + a.get(i).getAge() + "세) : "
//								+ a.get(i).getPhoneNumber() + "\n");
//					}
//					System.out.println();
//				}
//
//			} else if (menu == 3) {
//				if (a.size() == 0) {
//					System.out.println("등록된 연락처가 없습니다.\n");
//				} else {
//					for (int i = 0; i < a.size(); i++) {
//						System.out.print(i + 1 + ". " + a.get(i).getName() + "(" + a.get(i).getAge() + "세) : "
//								+ a.get(i).getPhoneNumber() + "\n");
//					}
//
//					System.out.print("삭제할 번호 입력 : \n");
//					userDeleteNum = sc.nextInt();
//					a.remove(userDeleteNum - 1);
//				}
//
//			} else if (menu == 4) {
//				System.out.print("검색할 이름 입력 : ");
//				name = sc.next();
//
//				int search = 0;
//
//				for (int i = 0; i < a.size(); i++) {
//
//					if (a.get(i).getName().equals(name)) {
//						System.out.print(i + 1 + ". " + a.get(i).getName() + "(" + a.get(i).getAge() + "세) : "
//								+ a.get(i).getPhoneNumber() + "\n");
//						search = 1;
//					}
//
//				}
//				System.out.println();
//
//				if (search == 0) {
//					System.out.println("검색한 이름의 정보가 없습니다.\n");
//				}
//
//			} else if (menu == 5) {
//				System.out.println("프로그램 종료");
//				break;
//			} else {
//				System.out.println("숫자를 다시 입력해주세요.");
//			}
//		}

	}

}
