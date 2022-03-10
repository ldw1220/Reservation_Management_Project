package com.servlet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.naming.*;
import javax.sql.*;

import com.servlet.dto.LoginDTO;

public class LoginDAO {
	//Ŀ�ؼ� Ǯ�� ��� ���� DataSource Ÿ���� ������ ����
	DataSource dataSource;
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	//ArrayList<LoginDTO> member = null;
    
    public LoginDAO() {
    	try {
    		//Context�� ����
    		Context context = new InitialContext();
    		//context.xml���� ������ connection pool�� �̸����� dataSource�� ����
    		dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Mysql");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public LoginDTO login(LoginDTO dto) {
    	LoginDTO info = null;
    	try {
    		con = dataSource.getConnection();
    		String sql = "SELECT m_ID, m_PWD FROM member Where m_ID=? and m_PWD=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getM_ID());
			pstmt.setString(2, dto.getM_PWD());
			
			res = pstmt.executeQuery();
			
			while (res.next()) {
				String m_ID = res.getString(1);
				String m_PWD = res.getString(2);
				
				info = new LoginDTO(m_ID, m_PWD);
			}
			
    	} catch (Exception e) {
    		e.printStackTrace();
    	} 
    	return info;
    }
}
