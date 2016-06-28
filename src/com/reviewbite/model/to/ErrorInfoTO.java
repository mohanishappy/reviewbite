/**
 * 
 */
package com.reviewbite.model.to;

/**
 * @author mkanakal
 *
 */
public class ErrorInfoTO {
	
	private String errorCode;
	private String errorMessage;
	private String errorDescription;
	private String messageToUser;

	/**
	 * 
	 */
	public ErrorInfoTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	/**
	 * @return the messageToUser
	 */
	public String getMessageToUser() {
		return messageToUser;
	}

	/**
	 * @param messageToUser the messageToUser to set
	 */
	public void setMessageToUser(String messageToUser) {
		this.messageToUser = messageToUser;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ErrorInfoTO [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", errorDescription="
				+ errorDescription + ", messageToUser=" + messageToUser + "]";
	}

	
}
