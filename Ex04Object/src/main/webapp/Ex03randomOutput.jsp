<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String main = request.getParameter("main");
		String[] item = request.getParameterValues("item");
		
		Random rd = new Random();
		int ranNum = rd.nextInt(item.length);
	%>
	<h1>랜덤 당첨 게임</h1>
	<fieldset>
		<legend>랜덤뽑기결과</legend>
		<%=main %><br>
		<%=item[ranNum] %>
	</fieldset>
</body>
</html>