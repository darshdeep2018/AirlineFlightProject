package com.example.AirlineFlight;

public class Admin {
	private String userName="Ram";
	private String password="1234";
	private boolean status=false;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}
