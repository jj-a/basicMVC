<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>bbs/bbsResult.jsp</title>
</head>
<body>

	<h3>글쓰기 결과</h3>
	<p>
		<a href="bbsList.jsp">글목록</a>
	</p>
	<table>
		<tr>
			<td>작성자</td>
			<td>${wname }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${subject }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${content }</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${passwd }</td>
		</tr>
	</table>

</body>
</html>