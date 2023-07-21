import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetSession")
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 세션 객체 생성
		HttpSession session = request.getSession();

		String id = (String) session.getAttribute("id");
		int age = (int) session.getAttribute("age");
		ArrayList<String> al = (ArrayList<String>) session.getAttribute("list");

		// 응답 데이터 형식
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.print("id : " + id + "<br>");
		out.print("age : " + age + "<br>");
		out.print("list : " + al + "<br>");
	}

}
