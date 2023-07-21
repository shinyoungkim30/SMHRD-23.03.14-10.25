package com.smhrd.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.WebMember;
import com.smhrd.model.WebMemberDAO;

public class LoginController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String url = "";

		try {
			request.setCharacterEncoding("UTF-8");

			String email = request.getParameter("email");
			String pw = request.getParameter("pw");

			WebMember member = new WebMember(email, pw);

			WebMemberDAO dao = new WebMemberDAO();
			WebMember member2 = dao.login(member);

			if (member2 != null) { // 로그인 성공
				// 세션에 member2 저장
				System.out.println("로그인 성공");
				
				HttpSession session = request.getSession();
				session.setAttribute("loginMember", member2);
				// index.jsp로 이동
				url = "index.jsp";
			} else { // 로그인 실패
				System.out.println("로그인 실패");
				// login.html로 이동
				url = "index.jsp";
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 방식 잘못 지정함!");
		}  catch (Exception e) {
			e.printStackTrace();
		}

		return url;
	}

}
