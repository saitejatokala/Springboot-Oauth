package wot.auth.server.domain;

import java.io.Serializable;

public class RoleOra implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String role;
	public RoleOra() {
		super();
	}
	public RoleOra(String username, String role) {
		super();
		this.username = username;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
