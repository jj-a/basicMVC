<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>login/loginResult.jsp</title>
</head>
<body>

	<h3>로그인 결과</h3>
	<p>
		<a href="login.do">마이페이지</a>
	</p>
	
	<table>
		<tr>
			<th>항목</th>
			<th>request</th>
			<th>session</th>
		</tr>
		<tr><th colspan=3>JSP</th></tr>
		<tr>
			<td>아이디</td>
			<td><%=request.getAttribute("r_id")%></td>
			<td><%=session.getAttribute("s_id")%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=request.getAttribute("r_id")%></td>
			<td><%=session.getAttribute("s_passwd")%></td>
		</tr>
		<tr><th colspan=3>EL</th></tr>
		<tr>
			<td>아이디</td>
			<td colspan=2>${id }</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td colspan=2>${passwd }</td>
		</tr>
	</table>

</body>
</html>