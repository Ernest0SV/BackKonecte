package org.konecte.BackKonecte.model;

public class UsuarioModel {
	
	private int    id;
	private String nombreUsuario;
	private String   telUsuario;
	private String correoUsuario;
	private String contrasena;
	private static int total = 0;

	//constructor vacio
	public UsuarioModel() {
		UsuarioModel.total++;
		id = UsuarioModel.total;
	}
	 //constructor sin id, por el auroincremental
	public UsuarioModel(String nombreUsuario, String telUsuario, String correoUsuario, String contrasena) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.telUsuario = telUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasena = contrasena;
		UsuarioModel.total++;
		id = UsuarioModel.total;
	}
	
	//Constructor con Id
	public UsuarioModel(int id, String nombreUsuario, String telUsuario, String correoUsuario, String contrasena) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.telUsuario = telUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasena = contrasena;
		UsuarioModel.total++;
		id = UsuarioModel.total;
	}
	
	
	
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
	public String getTelUsuario() {
		return telUsuario;
	}
	public void setTelUsuario(String telUsuario) {
		this.telUsuario = telUsuario;
	}
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		UsuarioModel.total = total;
	}
	@Override
	public String toString() {
		return "UsuarioModel [id=" + id + ", nombreUsuario=" + nombreUsuario + ", telUsuario=" + telUsuario
				+ ", correoUsuario=" + correoUsuario + ", contrasena=" + contrasena + "]";
	}
	

	
	
	//toString
	
}
