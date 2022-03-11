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
	 * POST ������� ������ �ִµ� �� �ҽ� �ڵ�� doGet���� ó���� �ϳ�?
	 * -> �� �����ʹ� doPost��ü�� �����ڸ��� doGet�޼ҵ带 ȣ���ϱ� ������ doGet���� �ڵ带 ó���ϰ� �ִ�. (�� ������ ó���Ϸ��� �ڵ� ���Ἲ)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
