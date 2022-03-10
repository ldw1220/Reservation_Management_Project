package com.servlet.dto;

public class LoginDTO {
	
	String m_ID;
	String m_PWD;
	
	public LoginDTO(String m_ID, String m_PWD) {
		this.m_ID = m_ID;
		this.m_PWD = m_PWD;
	}

	public String getM_ID() {
		return m_ID;
	}

	public void setM_ID(String m_ID) {
		this.m_ID = m_ID;
	}

	public String getM_PWD() {
		return m_PWD;
	}

	public void setM_PWD(String m_PWD) {
		this.m_PWD = m_PWD;
	}

}
