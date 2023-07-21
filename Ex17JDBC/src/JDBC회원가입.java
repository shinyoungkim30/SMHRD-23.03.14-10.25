import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC회원가입 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("직원 이름 입력 >> ");
		String inputName = sc.next();
		System.out.print("비밀번호 입력 >> ");
		String inputPw = sc.next();
		System.out.print("성별 입력 >> ");
		String inputGender = sc.next();
		System.out.print("나이 입력 >> ");
		int inputAge = sc.nextInt();
		System.out.print("연봉 입력 >> ");
		int inputMoney = sc.nextInt();

		// 1. DB 연결
		Connection conn = null;
		// 쿼리문을 실행시키는 객체
		// Java에서 문자열로된 쿼리문을 Oracle의 쿼리문으로 바꿔서 실행시켜준다
		PreparedStatement pstm = null;
		// 쿼리문을 통해서 발생한 응답을 담을 수 있는 객체
		ResultSet rs = null;

		try {
			// DB 연결할 수 있는 외부 클래스 가져오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 연결시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";

			// DriverManager -> DB랑 연결
			// Java, DB 통로 만들어준다
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}

		// 2. 접속 후 실행하고 싶은 쿼리문 실행
		try {
//			String sql = "select * from 직원";
//			String sql = "select * from 직원 where 이름 = '" + inputName + "' and 비밀번호 = '" + inputPw + "'";
			// ? 기호 활용
//			String sql = "select * from 직원 where 이름 = ? and 비밀번호 = ?";
			// insert into 직원 values
			// (직원id_seq.nextval,'1234','승환','남',20,null,'123-123',3000,'D006');
			String sql = "insert into 직원 values('A0011',?,?,?,?,null,'123-123',?,'D006')";

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, inputPw);
			pstm.setString(2, inputName);
			pstm.setString(3, inputGender);
			pstm.setInt(4, inputAge);
			pstm.setInt(5, inputMoney);

//			rs = pstm.executeQuery(); // select처럼 데이터 변경없이 조회할 때 사용
			// 변경된 행의 갯수를 반환
			int result = pstm.executeUpdate(); // insert, update, delete 같이 데이터 변경시 사용

			if (result > 0) {
				System.out.println("회원가입 성공!");
			}

			// 1번 문제 : 나이가 40살 이상인 직원의 이름만 출력해주세요
			// rs.next() : 주소값을 바꿔서 데이터가 있는지 없는지 판단
			// 반환타입 -> boolean type
			// 주의 : 위에 작성한 쿼리문 결과에 맞춰서 아래 while문을 작성해야 한다
//			while (rs.next()) {
//				if (rs.getInt("나이") >= 40) { // "나이"대신 인덱스번호 5 입력가능
//					// getString("이름") : 이름 컬럼에서 문자열데이터(이름)을 가져오겠습니다
//					// getString(인덱스번호) DB에서 인덱스를 사용할때는 1부터 시작
//					String name = rs.getString("이름"); // "이름"대신 3 입력가능
//					System.out.println(name);
//				}
//			}
			// 2번 문제 : 입력받은 name, pw를 이용해서 해당하는 직원의 나이를 출력해주세요
//			while (rs.next()) {
//				int age = rs.getInt("나이");
//				System.out.println("나이 : " + age);
//			}
//			while (rs.next()) {
//				if (inputName.equals(rs.getString("이름")) && inputPw.equals(rs.getString("비밀번호"))) {
//					int age = rs.getInt("나이");
//					System.out.println("나이 : " + age);
//				}
//			}
			// 3번 문제 : 이름, 비밀번호, 성별, 나이, 연봉 입력받아서 데이터를 추가하고 싶습니다

			// 쿼리문 결과에서 직원 이름 전부 출력
//			while (rs.next()) {
//				String name = rs.getString("이름");
//				System.out.println(name);
//			}
			// 쿼리문 결과에서 직원 중에 첫번째 직원 이름 출력
//			if (rs.next()) {
//				String name = rs.getString("이름");
//				System.out.println(name);
//			}
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}

		// 3. DB 연결 제거 -> 역순
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
