package com.servlet.dto;

public class LoginDTO {
	
	String m_ID;
	String m_Phone;
	
	public LoginDTO(String m_ID, String m_Phone) {
		this.m_ID = m_ID;
		this.m_Phone = m_Phone;
	}

	public String getM_ID() {
		return m_ID;
	}

	public String getM_Phone() {
		return m_Phone;
	}	
}
