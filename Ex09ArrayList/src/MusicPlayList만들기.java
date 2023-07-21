import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList만들기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> musiclist = new ArrayList<String>();

		int menu;
		int addSongMenu;
		String addSongName;
		int addSongIndex;
		int deleteMenu;
		int deleteSongNum;

		while (true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			menu = sc.nextInt();

			if (menu == 1) {
				getPlayList(musiclist);

				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				addSongMenu = sc.nextInt();

				if (addSongMenu == 1) {
					System.out.print("추가할 노래 입력 : ");
					addSongName = sc.next();
					musiclist.add(addSongName);
				} else {
					System.out.print("추가할 노래 입력 : ");
					addSongName = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					addSongIndex = sc.nextInt();
					musiclist.add(addSongIndex - 1, addSongName);
				}
				System.out.println("추가가 완료되었습니다.");

			} else if (menu == 2) {
				getPlayList(musiclist);

				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				deleteMenu = sc.nextInt();

				if (deleteMenu == 1) {
					System.out.print("삭제할 노래 입력 : ");
					deleteSongNum = sc.nextInt();
					musiclist.remove(deleteSongNum - 1);
					System.out.println("노래가 삭제되었습니다.");
				} else {
					musiclist.clear();
					System.out.println("전체list가 삭제되었습니다.");
				}

			} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}

	public static void getPlayList(ArrayList<String> musiclist) {
		System.out.println("========== 현재 재생 목록 ==========");
		if (musiclist.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(i + 1 + ". " + musiclist.get(i));
			}
		}
		System.out.println("=================================");
	}
}
