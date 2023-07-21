import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList만들기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 재생목록
		ArrayList<String> musicList = new ArrayList<String>();

		int menu; // 사용자가 선택한 메뉴를 저장(1,2,3)

		while (true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			menu = sc.nextInt();

			if (menu == 1) {

				printList(musicList);

				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				menu = sc.nextInt();
				if (menu == 1) {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine(); // 엔터키(공백문자) 처리
					musicList.add(sc.nextLine());
				} else { // menu==2
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String music = sc.nextLine();
					System.out.print("추가할 위치 입력 : ");
					int index = sc.nextInt();
					musicList.add(index - 1, music);
				}
				System.out.println("추가가 완료되었습니다.");
			} else if (menu == 2) {

				printList(musicList);

				System.out.print("[1]선택 삭제 [2]전체 삭제 >> ");
				menu = sc.nextInt();
				if (menu == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					musicList.remove(sc.nextInt() - 1);
					System.out.println("노래가 삭제되었습니다");
				} else { // menu==2
					musicList.clear();
					System.out.println("전체 List가 삭제되었습니다");
				}
			} else { // menu==3
				System.out.println("프로그램 종료");
				break;
			}
		}

	} // main 끝

	public static void printList(ArrayList<String> musicList) {
		System.out.println("===현재 재생 목록===");
		if (musicList.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < musicList.size(); i++) {
				System.out.println(i + 1 + ". " + musicList.get(i));
			}
		}
		System.out.println("=================");
	}

}
