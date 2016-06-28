/**
 * 
 */
package com.reviewbite.model.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.reviewbite.model.dao.LoginDAO;
import com.reviewbite.model.to.ErrorInfoTO;
import com.reviewbite.model.to.LoginRequestTO;
import com.reviewbite.model.to.LoginResponseTO;
import com.reviewbite.model.util.ErrorUtil;

/**
 * @author mkanakal
 *
 */
@Path("/json/metallica")
public class LoginService {

	/**
	 * 
	 */
	public LoginService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param request
	 * @return
	 */
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	public LoginResponseTO loginUser(LoginRequestTO request) {
		LoginResponseTO response = null;
		try {
			LoginDAO dao = new LoginDAO();
			response = dao.login(request);

		} catch (Exception e) {
			ErrorInfoTO errorInfo = ErrorUtil.getErrorInfo(e);
			if (null == response) {
				response = new LoginResponseTO();
			}
			response.setError(errorInfo);
		}
		return response;

	}

}
