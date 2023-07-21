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
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("op");
		
		if(op.equals("+")){
			out.print(num1+" + "+num2+" = "+ (num1+num2));
		} else if(op.equals("-")){
			out.print(num1+" - "+num2+" = "+ (num1-num2));
		} else if(op.equals("*")){
			out.print(num1+" * "+num2+" = "+ (num1*num2));
		} else {
			out.print(num1+" / "+num2+" = "+ (num1/num2));
		}
	%>
	
	<%
   		num1 = Integer.parseInt(request.getParameter("num1"));
	   num2 = Integer.parseInt(request.getParameter("num2"));
	   String ope = request.getParameter("op");
	   
	   int result;
	   
	   if(op.equals("plus")){
	      op="+";
	      result = num1+num2;
	   }else if(op.equals("minus")){
	      op="-";
	      result = num1-num2;
	   }else if(op.equals("mul")){
	      op="*";
	      result = num1*num2;
	   }else{
	      op="/";
	      result = num1/num2;
	   }
	   
	   out.print(num1+op+num2+"="+result);
	%>
   <%=num1 %><%=op %><%=num2 %>=<%=result %>
   <%=num1+op+num2+"="+result %>
</body>
</html>