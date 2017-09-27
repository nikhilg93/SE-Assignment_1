package com.assignment.Login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name="login1")

public class Login {

	public Login() {
		// TODO Auto-generated constructor stub
		
	}
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void validateUsername(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String username=value.toString();
	    if (username == null|| username.isEmpty()) {
	    			return;
	    }

	    if(!(username.equals("admin"))) {
	    	throw new ValidatorException(new FacesMessage(
	    			"Invalid Username"));
	    }
	    	
	}
	public void validatePassword(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String pwd=value.toString();
	    if (pwd == null|| pwd.isEmpty()) {
	    			return;
	    }

	    if(!(pwd.equals("admin"))) {
	    	throw new ValidatorException(new FacesMessage(
	    			"Invalid Password"));
	    }
	    	
	}
	public String loginSuccess()
	{
		return "success";
	}
	public String redirectRegister() {
		return "registration";
	}
}
