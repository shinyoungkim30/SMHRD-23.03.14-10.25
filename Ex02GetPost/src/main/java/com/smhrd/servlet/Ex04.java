package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String checkPw = request.getParameter("checkpw");
		String gender = request.getParameter("gender");
		String bloodType = request.getParameter("bloodtype");
		String birthday = request.getParameter("birthday");
		String[] hb = request.getParameterValues("hb");
		String color = request.getParameter("color");
		String textarea = request.getParameter("textarea");

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.print("아이디 : " + id);
		out.print("<br>");
		out.print("비밀번호 : " + pw);
		out.print("<br>");
		if (!pw.equals(checkPw)) {
			out.print("비밀번호가 일치하지 않습니다.");
			out.print("<br>");
		}
		out.print("성별 : " + gender);
		out.print("<br>");
		out.print("혈액형 : " + bloodType);
		out.print("<br>");
		out.print("생일 : " + birthday);
		out.print("<br>");
		out.print("취미 : ");
		for (int i = 0; i < hb.length; i++) {
			out.print(hb[i] + " ");
		}
		out.print("<br>");
		out.print("좋아하는 색 : " + color);
		out.print("<br>");
		out.print("남기고 싶은 말 : " + textarea);

	}

}
