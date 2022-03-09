package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.dao.LoginDAO;
import com.servlet.dto.LoginDTO;

/* 로그인 처리 서블릿 */

@WebServlet("/loginAction")
public class loginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		//HttpSession 인터페이스를 이용하여 session객체를 얻는다.
		//HttpSession session = request.getSession();
		
		LoginDAO loginDAO = new LoginDAO();
		ArrayList<LoginDTO> list = loginDAO.select();
		
		for (int i=0; i<list.size(); i++) {
			LoginDTO dto = list.get(i);
			String m_ID = dto.getM_ID();
			String m_Phone = dto.getM_Phone();
			
			out.println("사용자 이름 : " + m_ID + ", ");
			out.println("사용자 전화번호 : " + m_Phone + "<br>");
		}
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
