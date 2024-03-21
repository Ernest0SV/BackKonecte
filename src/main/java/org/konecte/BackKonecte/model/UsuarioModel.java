package org.konecte.BackKonecte.model;

public class UsuarioModel {
	
	private int    id;
	private String nombreUsuario;
	private long   telUaster;
	private String correoUaster;
	private String contrasena;

	//constructor vacio
	public UsuarioModel() {
		
	}


	//constructor sin id
	public UsuarioModel(String nombreUsuario, long telUaster, String correoUaster, String contrasena) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.telUaster = telUaster;
		this.correoUaster = correoUaster;
		this.contrasena = contrasena;
	}
	
	
	public UsuarioModel(int id, String nombreUsuario, long telUaster, String correoUaster, String contrasena) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.telUaster = telUaster;
		this.correoUaster = correoUaster;
		this.contrasena = contrasena;
	}

	//getters and setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public long getTelUaster() {
		return telUaster;
	}


	public void setTelUaster(long telUaster) {
		this.telUaster = telUaster;
	}


	public String getCorreoUaster() {
		return correoUaster;
	}


	public void setCorreoUaster(String correoUaster) {
		this.correoUaster = correoUaster;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	@Override
	public String toString() {
		return "UsuarioModel [id=" + id + ", nombreUsuario=" + nombreUsuario + ", telUaster=" + telUaster
				+ ", correoUaster=" + correoUaster + ", contrasena=" + contrasena + "]";
	}
	
	
	
	
}
