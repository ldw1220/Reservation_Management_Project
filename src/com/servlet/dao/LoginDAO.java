package com.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.naming.*;
import javax.sql.*;

import com.servlet.dto.LoginDTO;

public class LoginDAO {
	//커넥션 풀을 담기 위한 DataSource 타입의 변수를 선언
	DataSource dataSource;
    
    public LoginDAO() {
    	try {
    		//Context를 생성
    		Context context = new InitialContext();
    		//context.xml에서 설정한 connection pool의 이름으로 dataSource에 전달
    		dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Mysql");
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
			// dataSource로 부터 커넥션을 가져온다.
			con = dataSource.getConnection();
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
