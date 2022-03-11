<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>사용자 화면입니다.</title>
	</head>
	<body>
		<h1>사용자들에게 보여지는 화면입니다.</h1>
		
		<%
			session = request.getSession();
			out.print("User ID : " + session.getAttribute("info") + "<br>");
		%>
		<form action="LogoutSVR" method="post">
			<input type="submit" value="logout">
		</form>
	</body>
</html>