package com.struts.login.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.login.service.LoginService;

public class LoginAction extends ActionSupport {
   
	private static final long serialVersionUID = 8829356716370598414L;
	private String username;
    private String password;
 
    private LoginService loginService; 
    public String execute() {
 
    	 
        if (loginService.validateUser(this.username, this.password)) {
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
    
    
}

