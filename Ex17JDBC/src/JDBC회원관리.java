import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {

	public static void main(String[] args) {

		UserDAO dao = new UserDAO();

		Scanner sc = new Scanner(System.in);

		String inputId = "";
		String inputPw = "";
		String inputNick = "";

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]전체 회원 조회 [4]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("=====로그인=====");
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("패스워드 : ");
				inputPw = sc.next();

				String nick = dao.login(inputId, inputPw);

				if (nick != null) {
					System.out.println(nick + "님 환영합니다!");
				}

			} else if (menu == 2) {
				System.out.println("=====회원가입=====");
				System.out.print("아이디를 입력하세요 : ");
				inputId = sc.next();
				System.out.print("패스워드를 입력하세요 : ");
				inputPw = sc.next();
				System.out.print("닉네임를 입력하세요 : ");
				inputNick = sc.next();

				int result = dao.join(inputId, inputPw, inputNick);

				if (result > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}

			} else if (menu == 3) {
				System.out.println("=====전체 회원 조회=====");

				ArrayList<UserDTO> userList = dao.getUserList(); // Ctrl 누른 상태로 메서드명 클릭

				for (int i = 0; i < userList.size(); i++) {
					String id = userList.get(i).getId();
					String pw = userList.get(i).getPw();
					String nick = userList.get(i).getNick();
					System.out.println("ID : " + id + " PW : " + pw + " NICK : " + nick);
				}
				
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
			}
		}

	}
}
