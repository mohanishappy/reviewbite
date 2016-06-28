/**
 * 
 */
package com.reviewbite.model.to;

/**
 * @author mkanakal
 *
 */
public class BaseInfoTO {

	private ErrorInfoTO error;

	/**
	 * 
	 */
	public BaseInfoTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the error
	 */
	public ErrorInfoTO getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(ErrorInfoTO error) {
		this.error = error;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseInfoTO [error=" + error + "]";
	}
	
	

}
