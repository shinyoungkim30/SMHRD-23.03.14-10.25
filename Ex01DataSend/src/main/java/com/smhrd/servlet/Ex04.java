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

		int num1 = Integer.parseInt(request.getParameter("num1"));

		String ope = request.getParameter("ope");

		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		System.out.println(ope);
		
		// 응답
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		if (ope.equals("plus")) {
			out.print(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (ope.equals("minus")) {
			out.print(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (ope.equals("mul")) {
			out.print(num1 + " * " + num2 + " = " + (num1 * num2));
		} else {
			out.print(num1 + " / " + num2 + " = " + (num1 / num2));
		}

	}

}
