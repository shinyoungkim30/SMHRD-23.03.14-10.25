<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
		</tr>
	</table>
	<br>
	<table border="1">
		<tr>
			<%
				for(int i=1; i<=10; i++){
					out.print("<td>"+i+"</td>");
				}
			%>
		</tr>
	</table>
	<table border="1">
		<tr>
			<%for(int i=1; i<=10; i++){%>
				<td><%=i %></td>
			<%}%>
		</tr>
	</table>
</body>
</html>