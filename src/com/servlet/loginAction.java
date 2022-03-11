package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.dao.LoginDAO;
import com.servlet.dto.LoginDTO;

/* �α��� ó�� ���� */

@WebServlet("/loginAction")
public class loginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String ADMINISTER = "admin";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String m_ID = request.getParameter("m_ID");
		String m_PWD = request.getParameter("m_PWD");
		
		LoginDTO loginDTO = new LoginDTO(m_ID, m_PWD);
		LoginDAO loginDAO = new LoginDAO();
		
		LoginDTO info = loginDAO.login(loginDTO);
		
		if (info != null) {
			if (info.getM_ID().equals(ADMINISTER)) {
				System.out.println("������ �α��� ����");
				HttpSession session = request.getSession();
				session.setAttribute("info", info.getM_ID());
				response.sendRedirect("manager.jsp");
			} else {
				System.out.println("����� �α��� ����");
				HttpSession session = request.getSession();
				session.setAttribute("info", info.getM_ID());
				response.sendRedirect("home.jsp");
			}
		} 
		else {
			System.out.println("�α��� ����");
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('�������� �ʴ� ���̵�ų� ���� ������ Ʋ�Ƚ��ϴ�.'); location.href='loginpage.jsp';</script>");
			writer.close();
		}
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
