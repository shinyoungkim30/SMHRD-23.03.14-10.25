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
		String name = request.getParameter("name");
		int java = Integer.parseInt(request.getParameter("java"));
		int web = Integer.parseInt(request.getParameter("web"));
		int iot = Integer.parseInt(request.getParameter("iot"));
		int and = Integer.parseInt(request.getParameter("and"));
		
		double avg = (double)(java+web+iot+and)/4;
		
		String grade = "";
		if(avg>=95){
			grade = "A+";
		} else if(avg>=90){
			grade = "A";
		} else if(avg>=85){
			grade = "B+";
		} else if(avg>=80){
			grade = "B";
		} else {
			grade = "F";
		}		
	%>
	<fieldset>
		<legend>학점확인프로그램</legend>
		<form action="*">
			<table>
				<tr>
					<td>이름</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>Java점수</td>
					<td><%=java %></td>
				</tr>
				<tr>
					<td>Web점수</td>
					<td><%=web %></td>
				</tr>
				<tr>
					<td>IoT점수</td>
					<td><%=iot %></td>
				</tr>
				<tr>
					<td>Android점수</td>
					<td><%=and %></td>
				</tr>
				<tr>
					<td>평균</td>
					<td><%=avg %></td>
				</tr>
				<tr>
					<td>학점</td>
					<td><b><%=grade %></b></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>