

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Ex08LoginCheck")
public class Ex08LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("test")&&pw.equals("12345")) {
			// 로그인 성공
			// 1. 세션 값 저장(ID)
			HttpSession session = request.getSession();
			
			session.setAttribute("id", id);
			
			// 2. Main.jsp 이동			
			// Redirecting : 이동하고 싶다!
			response.sendRedirect("Ex08Main.jsp");
			// forwarding : 데이터를 포함해서 이동하고 싶다!
//			RequestDispatcher rd = request.getRequestDispatcher("Ex08Main.jsp");
//			rd.forward(request, response);
		} else {
			// 로그인 실패
			response.sendRedirect("Ex08LoginForm.html");
		}
		
	}

}
