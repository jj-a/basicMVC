<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>login/msgView.jsp</title>
</head>
<body>

	<h3>로그인 결과</h3>
	<p>
		<a href="login.do">로그인 화면</a>
	</p>
	
	<table>
		<tr>
			<td>${msg }</td>
		</tr>
		<tr>
			<td>${link }</td>
		</tr>
	</table>

</body>
</html>