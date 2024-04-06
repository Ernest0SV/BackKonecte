package org.konecte.BackKonecte.dto;

public class ChangePassword {
	private String password;
	private String npassword;
	public ChangePassword(String password, String npassword) {
		super();
		this.password = password;
		this.npassword = npassword;
	}//controler
	public ChangePassword() {
	}
	public String getPassword() {
		return password;
	}//getPassord
	public void setPassword(String password) {
		this.password = password;
	}//setPassword
	public String getNpassword() {
		return npassword;
	}//getNpassword
	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}//setNpassword
	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}//toString
	

}
