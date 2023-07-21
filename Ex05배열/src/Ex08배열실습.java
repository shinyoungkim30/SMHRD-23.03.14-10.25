import java.util.Scanner;

public class Ex08배열실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu;

		String id;
		String pw;

		int cnt = 0;

		boolean sw = true; // true : 로그인 불가 / false : 로그인 가능

		String[] idArray = new String[3];
		String[] pwArray = new String[3];

		while (true) {
			System.out.print("1.회원가입 2.로그인 3.종료 ");
			menu = sc.nextInt();

//			System.out.print("아이디 : ");
//			for (String i : idArray) {
//				System.out.print(i + " ");
//			}
//			System.out.print("비밀번호 : ");
//			for (String i : pwArray) {
//				System.out.print(i + " ");
//			}
//			System.out.println();

			if (menu == 1) {
				System.out.println("==회원가입==");

				if (cnt == 3) {
					System.out.println("회원가입 불가");
				} else {
					System.out.print("ID : ");
					idArray[cnt] = sc.next();
					System.out.print("PW : ");
					pwArray[cnt] = sc.next();

					cnt++;
				}

			} else if (menu == 2) {
				System.out.println("로그인");

				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PW : ");
				pw = sc.next();

				for (int i = 0; i < cnt; i++) {
					if (idArray[i].equals(id) && pwArray[i].equals(pw)) {
						System.out.println("로그인 성공");
						sw = false;
						break;
					}
				}

				if (sw) {
					System.out.println("로그인 실패");
				}

			} else {
				System.out.println("종료");
				break;
			}
		}

		// -----------------------------------
		// 내가 작성했던 코드

//		String[] id_array = new String[3];
//		String[] pw_array = new String[3];
//
//		boolean idCheck = true;
//		boolean pwCheck = true;
//
//		int userNum = 0;
//
//		while (true) {
//
//			System.out.println("1.회원가입 2.로그인 3.종료");
//			int userChoice = sc.nextInt();
//
//			if (userChoice == 1) {
//				System.out.println("===회원가입===");
//				System.out.print("id 입력 : ");
//				id_array[userNum] = sc.next();
//				System.out.print("pw 입력 : ");
//				pw_array[userNum] = sc.next();
//				System.out.println("가입 성공");
//				userNum += 1;
//
//			} else if (userChoice == 2) {
//				System.out.println("===로그인===");
//
//				System.out.print("id 입력 : ");
//				for (int i = 0; i < id_array.length; i++) {
//					if (sc.next().equals(id_array[i])) {
//						idCheck = true;
//						break;
//					}
//				}
//
//				System.out.print("pw 입력 : ");
//				for (int i = 0; i < id_array.length; i++) {
//					if (sc.next().equals(pw_array[i])) {
//						pwCheck = true;
//						break;
//					}
//				}
//
//				if (idCheck && pwCheck) {
//					System.out.println("로그인 성공");
//				} else {
//					System.out.println("로그인 실패");
//				}
//
//			} else {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//
//		}

	}

}
