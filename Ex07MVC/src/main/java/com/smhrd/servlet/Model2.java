package com.smhrd.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.FullStack;

@WebServlet("/Model2")
public class Model2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// model2로 요청 먼저!
		// 1. DB 연동
		// 2. SQL 실행 (FullStack 테이블안에 모든 값 가져오기)		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		FullStack fs = null;
		// ArrayList : 데이터 검색 용이, 중간에 데이터를 삭제하거나 추가할 경우 나머지 데이터들을 이동해야 한다
		// LinkedList : 중간 데이터 삭제, 추가 용이
		// 상황에 따라 다운캐스팅해서 사용
		// ArrayList<FullStack> list = new ArrayList<>();
		List<FullStack> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
	
			conn = DriverManager.getConnection(url, user, password);
	
			String sql = "select * from fullstack";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
	
			while (rs.next()) {
				String name = rs.getString("name");
				String major = rs.getString("major");
				String phone = rs.getString("phone");
	
				fs = new FullStack(name, major, phone);
				
				list.add(fs);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 클래스 못찾음!");
		} catch (SQLException e){
			System.out.println("SQL 예외 발생!");
		} catch (Exception e){
			System.out.println("다른 예외 발생!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();				
			} catch (Exception e){
				System.out.println("finally에서 예외상황 발생!");
				e.printStackTrace();
			}
		}
		// 3. 3명의 학생정보 -> 세션
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// -> Ex02model2.jsp로 이동
		response.sendRedirect("Ex02model2.jsp");
	}

}
