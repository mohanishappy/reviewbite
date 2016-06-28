/**
 * 
 */
package com.reviewbite.model.to;

/**
 * @author mkanakal
 *
 */
public class LoginResponseTO extends BaseInfoTO{
	
	private boolean status;

	/**
	 * 
	 */
	public LoginResponseTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginResponseTO [status=" + status + "]";
	}

	
}
