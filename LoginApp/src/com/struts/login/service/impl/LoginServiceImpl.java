/**
 * 
 */
package com.struts.login.service.impl;

import com.struts.login.service.LoginService;

/**
 * @author 425002
 *
 */
public class LoginServiceImpl implements LoginService{

	@Override
	public Boolean validateUser(String username,String password) {
		 if (username.equals("admin")
	                && password.equals("Password123")) {
	            return Boolean.TRUE;
	        } else {
	            
	            return Boolean.FALSE;
	      }
	}

}
