/**
 * 
 */
package com.reviewbite.model.util;

import com.reviewbite.model.to.ErrorInfoTO;

/**
 * @author mkanakal
 *
 */
public class ErrorUtil {

	/**
	 * 
	 */
	public ErrorUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ex
	 * @return
	 */
	public static ErrorInfoTO getErrorInfo(Exception ex) {
		ErrorInfoTO errorInfo = new ErrorInfoTO();
		if (null != ex) {
			errorInfo.setErrorMessage(ex.getMessage());
			errorInfo.setMessageToUser(ex.getLocalizedMessage());
		}
		return errorInfo;
	}

}
