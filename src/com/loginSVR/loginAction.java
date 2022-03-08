package com.loginSVR;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/* 로그인 처리 서블릿 */

@WebServlet("/loginAction")
public class loginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
        // driver loading을 위한 기본 정보
        String database = "rmpdb"; // db이름

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/" + database;
        String id = "root";
        String pw = "xldzmf12";
		String m_ID = request.getParameter("m_ID");
		String m_Phone = request.getParameter("m_Phone");

		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			String sql = "SELECT * FROM member";
			res = stmt.executeQuery(sql);
			
			while (res.next()) {
				String member_ID = res.getString("m_ID");
				String member_Phone = res.getString("m_Phone");
				
				out.print("사용자 이름 : " + member_ID + ", ");
				out.print("사용자 휴대폰 번호 : " + member_Phone + "<br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (res != null) res.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//HttpSession 인터페이스를 이용하여 session객체를 얻는다.
		//HttpSession session = request.getSession();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
