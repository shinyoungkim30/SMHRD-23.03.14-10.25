package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 개발자2
		// : 사용자가 보여질 부분이 들어갈 곳
		// 뷰
		//
		// GameDummy game = new GameDummy();
		PlusGame game = new PlusGame();
		Scanner sc = new Scanner(System.in);

		// Member 자료형을 관리하는 ArrayList 만들기
		ArrayList<Member> list = new ArrayList<>();
		int cnt = 1;

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("닉네임 입력 : ");
				String nickName = sc.next();

				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				Member m1 = new Member(nickName, pw);
				list.add(m1);

			} else {
				System.out.print("닉네임 입력 : ");
				String nickName = sc.next();

				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				int a = 0;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getNickName().equals(nickName) && list.get(i).getPw().equals(pw)) {
						System.out.println("로그인 성공");
						a = 1;
					} else {// 로그인 실패시
						System.out.println("로그인에 실패하셨습니다.");
					}
				}
				if (a == 1) {

					while (true) {
						System.out.println("-----사칙연산 게임 start------");
						System.out.print(nickName + "님 게임 난이도를 선택해주세요!");
						int input = sc.nextInt(); // 난이도 쉬움 어려움 선택하기
						if (input == 1) { // 난이도 쉬움

							System.out.println(game.getQuizMsg(input));
							int ans = sc.nextInt();
							if (game.checkAnswer(ans)) {// 정답일시
								System.out.println("정답입니다.");
								System.out.println("다음으로 넘어갑니다!");
								cnt++;
								if (cnt == 5) {
									System.out.println("게임 종료");
									break;
								}
							} else {// false일시
								System.out.println("틀렸습니다.");

								ans = sc.nextInt();
							}

						} else if (input == 2) { // 난이도 어려움
							System.out.println(game.getQuizMsg(input));
							int ans = sc.nextInt();
							if (game.checkAnswer(ans)) {// 정답일시
								System.out.println("정답입니다.");
								System.out.println("다음으로 넘어갑니다!");
								cnt++;
								if (cnt == 5) {
									System.out.println("게임 종료");
									break;
								}
							} else {// false일시
								System.out.println("틀렸습니다.");

								ans = sc.nextInt();
							}

						}

					}

				}
			}

		}

	}

}
