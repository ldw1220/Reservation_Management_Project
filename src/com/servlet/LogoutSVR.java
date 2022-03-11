package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutSVR")
public class LogoutSVR extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		
		response.sendRedirect("loginpage.jsp");
	}

	/**
	 * POST 방식으로 보내고 있는데 왜 소스 코드는 doGet에서 처리를 하냐?
	 * -> 폼 데이터는 doPost객체에 들어오자마자 doGet메소드를 호출하기 때문에 doGet에서 코드를 처리하고 있다. (한 곳에서 처리하려고 코드 간결성)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
