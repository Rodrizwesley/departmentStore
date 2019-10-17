package com.wesley.departmentStore.model.entities;

public class Users extends Roles{
	
	private Integer idUser;
	private String userLogin;
	private String userPassword;
	
	public Users() {
		
	}

	public Users(Integer idRole, String nmRole,Integer idUser, String userLogin, String userPassword) {
		super(idRole, nmRole);
		this.idUser = idUser;
		this.userLogin = userLogin;
		this.userPassword = userPassword;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "Users [idUser=" + idUser + ", userLogin=" + userLogin + ", userPassword=" + userPassword + "]";
	}
	
}
