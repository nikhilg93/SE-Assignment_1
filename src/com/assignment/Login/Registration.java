package com.assignment.Login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name="reg")
public class Registration {
	
private String fname;
private String lname;
private String address;
private String phoneNumber;
private String email;
private String userName;
private String password;

	public Registration() {
	//	super();
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
	public String regSuccess()
	{
		return "regsuccess";
	}
	public void validateFname(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String fname=value.toString();
	   
	    if(!(fname.matches("[a-zA-Z_]+"))) {
	    	throw new ValidatorException(new FacesMessage(
	    			"Name should contain only characters"));
	    }
	    	
	}
	public void validateLname(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String lname=value.toString();
	   
	    if(!(lname.matches("[a-zA-Z_]+"))) {
	    	throw new ValidatorException(new FacesMessage(
	    			"Name should contain only characters"));
	    }
	    	
	}
	public void validatePhonenumber(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String lname=value.toString();
	   
	    if(!(lname.matches("[0-9]+"))) {
	    	throw new ValidatorException(new FacesMessage(
	    			"Phone Number should contain only numbers"));
	    }
	    	
	}
	public void validateUsername(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String username=value.toString();
	   
	    if(!(username.matches("[a-zA-Z_]+"))) {
	    	throw new ValidatorException(new FacesMessage(
	    			"Username should contain only characters"));
	    }
	    	
	}


}
