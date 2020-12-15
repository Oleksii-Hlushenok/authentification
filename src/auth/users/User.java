/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth.users;

/**
 *
 * @author oleksii
 */
public class User {
	private String login;
	private String password;
	private Roles role;

	public User(String login, String password, Roles role) {
		this.login = login;
		this.password = password;
		this.role = role;
	}
	
	


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}
	
	
	
}
