package com.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.servlet.dto.LoginDTO;

public class LoginDAO {
    // driver loading�� ���� �⺻ ����
    String database = "rmpdb"; // db�̸�
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost/" + database;
    String id = "root";
    String pw = "xldzmf12";
    
    public LoginDAO() {
    	try {
    		Class.forName(driver);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public ArrayList<LoginDTO> select() {
    	
    	ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
    	
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
    	
		try {
			con = DriverManager.getConnection(url, id, pw);
			String sql = "SELECT * FROM member";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery(sql);
			
			while (res.next()) {
				String m_ID = res.getString("m_ID");
				String m_Phone = res.getString("m_Phone");
				
				LoginDTO loginDTO = new LoginDTO(m_ID, m_Phone);
				list.add(loginDTO);
			}
			
		} catch (Exception e) {
    		e.printStackTrace();
    	} finally {
    		try {
				if (res != null) res.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
    	}
    	return list;
    } 
}
