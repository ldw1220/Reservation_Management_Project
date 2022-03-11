<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>관리자 화면입니다.</title>
	</head>
	<body>
		<h1>관리자만이 들어갈 수 있는 페이지</h1>
		
				
		<%
			session = request.getSession();
			out.print("User ID : " + session.getAttribute("info") + "<br>");
		%>
		<form action="LogoutSVR" method="post">
			<input type="submit" value="logout">
		</form>
	</body>
</html>