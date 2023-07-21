<%@page import="java.util.List"%>
<%@page import="com.smhrd.model.FullStack"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<FullStack> list = (List<FullStack>)session.getAttribute("list");
	%>
	<!-- 세션안에 저장되어 있는 학생정보(3명) 테이블 출력 -->	
	<table border="1px solid">
		<tr>
			<th>이름</th>
			<th>전공</th>
			<th>전화번호</th>			
		</tr>
		<%for(int i=0; i<list.size(); i++){ %>
		<tr>			
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getMajor() %></td>
			<td><%=list.get(i).getPhone() %></td>
		</tr>
		<%} %>				
		<%for(FullStack fs:list){ %>
		<tr>			
			<td><%=fs.getName() %></td>
			<td><%=fs.getMajor() %></td>
			<td><%=fs.getPhone() %></td>
		</tr>
		<%} %>		
	</table>
</body>
</html>