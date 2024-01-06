package com.sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "REGISTRATION")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	
	@Column(name = "USER_MOBILE")
	private String userMobile;
	
	@Transient
	private String errorMessage;

	public Register() {
		super();
		
	}
	
	public Register(Long id, String userName, String userEmail, String userPassword, String userMobile) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "Resgister [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userMobile=" + userMobile + "]";
	}
	
}
