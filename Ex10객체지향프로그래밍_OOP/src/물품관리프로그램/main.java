package 물품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Product> ps = new ArrayList<>();

		while (true) {
			System.out.println("[1]물건 추가 [2]예상 판매량 조회 [3]종료 ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.print("물건 이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int price = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				// 1. 사용자한테 입력받은 name,price,amount를 Product자료형으로 묶어주자
				Product p = new Product(name, price, amount);
				// 2. ps.add();
				ps.add(p);

			} else if (select == 2) {
				System.out.println("제품명    단가    수량");

				for (int i = 0; i < ps.size(); i++) {
					System.out.println(
							ps.get(i).getName() + "    " + ps.get(i).getUnitPrice() + "    " + ps.get(i).getAmount());
				}

				int sum = 0;

				for (int i = 0; i < ps.size(); i++) {
					sum += ps.get(i).getUnitPrice() * ps.get(i).getAmount();
				}
				System.out.println("판매시 매출 : " + sum);
				System.out.println();

			} else if (select == 3) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("숫자를 다시 입력하세요.");
			}
		}

//		ProductSystem productManager = new ProductSystem();
//
//		int menu;
//		String name;
//		int unitPrice;
//		int amount;
//		String a;
//		int sales;
//
//		while (true) {
//			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 ");
//			menu = sc.nextInt();
//
//			if (menu == 1) {
//				System.out.print("물건 이름 : ");
//				name = sc.next();
//				System.out.print("단가 : ");
//				unitPrice = sc.nextInt();
//				System.out.print("수량 : ");
//				amount = sc.nextInt();
//				System.out.println();
//
//				productManager.addList(name, unitPrice, amount);
//
//			} else if (menu == 2) {
//				System.out.println("제품명\t"+"단가\t"+"수량");
//				a = productManager.getProductList();
//				System.out.println(a);
//				sales = ;
//				System.out.println("판매 시 매출 : "+ sales);
//
//			} else {
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}

	}

}
