<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>관리자 화면입니다.</title>
	</head>
	<body>
		<h1>관리자만이 들어갈 수 있는 페이지</h1>
		
		<%
			String ADMINISTER = "admin";

			if (session.getAttribute("info").equals(ADMINISTER)) {
				session = request.getSession();
				out.print("User ID : " + session.getAttribute("info") + "<br>");
				System.out.println(session.getAttribute("info"));
			}
			else {
				PrintWriter writer = response.getWriter();
				writer.println("<script>alert('접근 권한이 없습니다.'); location.href='loginpage.jsp';</script>");
				writer.close();
			}
		%>
		<form action="LogoutSVR" method="post">
			<input type="submit" value="logout">
		</form>
	</body>
</html>