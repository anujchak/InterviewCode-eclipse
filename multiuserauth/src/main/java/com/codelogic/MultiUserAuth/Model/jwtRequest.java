package com.codelogic.MultiUserAuth.Model;

public class jwtRequest {
private String username;
private String password;
public jwtRequest(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public jwtRequest() {
	super();
	// TODO Auto-generated constructor stub
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
