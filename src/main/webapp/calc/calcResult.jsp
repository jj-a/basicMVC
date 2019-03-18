<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calc/calcResult.jsp</title>
</head>
<body>

	<h3>EL(1)</h3>
	<h1>${msg }</h1>

	${img==null? "": img }
	
	<table>
		<tr>
			<td>숫자1</td>
			<td>${num1 }</td>
		</tr>
		<tr>
			<td>숫자2</td>
			<td>${num2 }</td>
		</tr>
		<tr>
			<td>연산 결과</td>
			<td>${result }</td>
		</tr>
	</table>


	<h3>EL(2)</h3>
	<h1>${requestScope.msg }</h1>

	${requestScope.img }
	
	<table>
		<tr>
			<td>숫자1</td>
			<td>${requestScope.num1 }</td>
		</tr>
		<tr>
			<td>숫자2</td>
			<td>${requestScope.num2 }</td>
		</tr>
		<tr>
			<td>연산 결과</td>
			<td>${requestScope.result }</td>
		</tr>
	</table>


	<h3>JSP</h3>
	<h1><%=request.getAttribute("msg")%></h1>
	
<%=request.getAttribute("img")%>
	
	<table>
		<tr>
			<td>숫자1</td>
			<td><%=request.getAttribute("num1")%></td>
		</tr>
		<tr>
			<td>숫자2</td>
			<td><%=request.getAttribute("num2")%></td>
		</tr>
		<tr>
			<td>연산 결과</td>
			<td><%=request.getAttribute("result")%></td>
		</tr>
	</table>

</body>
</html>