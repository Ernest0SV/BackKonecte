package org.konecte.BackKonecte.dto;

public class Token {
	private final String accessToken;
	
	public Token(String accessToken) {
		super();
		this.accessToken=accessToken;
	}//constructor
	public String getAccessToken() {
		return accessToken;
	}//getAccessToken
}
