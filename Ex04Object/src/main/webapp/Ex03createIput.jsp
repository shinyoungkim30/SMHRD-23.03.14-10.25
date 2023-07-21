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
		int num = Integer.parseInt(request.getParameter("num"));
	%>
	<h1>랜덤 당첨 게임</h1>
	<fieldset>
		<legend>랜덤뽑기</legend>
		<form action="Ex03randomOutput.jsp">
			<table>
				<tr>
					<td>주제:</td>
					<td><input type="text" name="main"></td>
				</tr>
				<%
					for(int i=1; i<=num; i++){%>
						<tr>
							<td>아이템 : </td>
							<td><input type="text" name="item"></td>
						</tr>						
				<% 	}
				%>
			</table>
			<input type="submit" value="랜덤뽑기">
		</form>
	</fieldset>
</body>
</html>