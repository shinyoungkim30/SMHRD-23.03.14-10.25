package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.WebMemberDAO;

public class DeleteController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			String email = request.getParameter("email");
			
			WebMemberDAO dao = new WebMemberDAO();
			int cnt = dao.delete(email);
			
			if(cnt > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "select.jsp";
	}

}
