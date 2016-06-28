/**
 * 
 */
package com.reviewbite.model.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.reviewbite.model.dao.RegistrationDAO;
import com.reviewbite.model.to.ErrorInfoTO;
import com.reviewbite.model.to.RegistrationRequestTO;
import com.reviewbite.model.to.RegistrationResponseTO;
import com.reviewbite.model.util.ErrorUtil;

/**
 * @author mkanakal
 *
 */
public class RegistrationService {

	/**
	 * 
	 */
	public RegistrationService() {
		// TODO Auto-generated constructor stub
	}
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	public RegistrationResponseTO registerUser(RegistrationRequestTO request) {
		RegistrationResponseTO response = null;
		try {
			RegistrationDAO dao = new RegistrationDAO();
			response = dao.register(request);

		} catch (Exception e) {
			ErrorInfoTO errorInfo = ErrorUtil.getErrorInfo(e);
			if (null == response) {
				response = new RegistrationResponseTO();
			}
			response.setError(errorInfo);
		}
		return response;

	}

}
