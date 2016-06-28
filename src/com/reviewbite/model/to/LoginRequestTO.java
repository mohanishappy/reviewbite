/**
 * 
 */
package com.reviewbite.model.to;

/**
 * @author mkanakal
 *
 */
public class LoginRequestTO extends BaseInfoTO{
	
	private String username;
	private String password;

	/**
	 * 
	 */
	public LoginRequestTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginRequestTO [username=" + username + ", password=" + password + "]";
	}
	
	

}
