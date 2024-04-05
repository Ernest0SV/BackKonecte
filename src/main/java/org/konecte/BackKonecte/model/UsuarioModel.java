package org.konecte.BackKonecte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)	
	private Long id;
	@Column(nullable=false)
	private String nombreUsuario;
	@Column(nullable=false)
	private String telUsuario;
	@Column(nullable=false)
	private String correoUsuario;
	@Column(nullable=false)
	private String contrasena;
	// private static int total = 0;

	//constructor vacio
	//	UsuarioModel.total++;
	//	id = UsuarioModel.total;
	 //constructor sin id, por el auroincremental
	public UsuarioModel(String nombreUsuario, String telUsuario, String correoUsuario, String contrasena) {
		super();
		// this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.telUsuario = telUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasena = contrasena;
		//UsuarioModel.total++;
		//id = UsuarioModel.total;
	}
	
	public UsuarioModel() {}// constructor vacío
	
	/* Constructor con Id
	public UsuarioModel(Long id, String nombreUsuario, String telUsuario, String correoUsuario, String contrasena) {
		super();
		// this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.telUsuario = telUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasena = contrasena;
		//UsuarioModel.total++;
		//id = UsuarioModel.total;
	} */
	
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	//public static int getTotal() {
	//	return total;
	//}
/*	public static void setTotal(long total) {
		UsuarioModel.total = total;
	} */
	
	@Override
	public String toString() {
		return "UsuarioModel [id=" + id + ", nombreUsuario=" + nombreUsuario + ", telUsuario=" + telUsuario
				+ ", correoUsuario=" + correoUsuario + ", contrasena=" + contrasena + "]";
	}
	

	
	
	//toString
	
}
