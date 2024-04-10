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
	@Column(nullable=false)
	private String password;
	
	public UsuarioModel(String nombreUsuario, String telUsuario, String correoUsuario, String contrasena, String password) {
		super();
		// this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.telUsuario = telUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasena = contrasena;
		this.password = password;
		//UsuarioModel.total++;
		//id = UsuarioModel.total;
	}
	
	public UsuarioModel() {}// constructor vacío
	
	public Long getId() {
		return id;
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "UsuarioModel [id=" + id + ", nombreUsuario=" + nombreUsuario + ", telUsuario=" + telUsuario
				+ ", correoUsuario=" + correoUsuario + ", contrasena=" + contrasena + ", password=" + password + "]";
	}
	
	//public static int getTotal() {
	//	return total;
	//}
/*	public static void setTotal(long total) {
		UsuarioModel.total = total;
	} */
	
	

	
	
	//toString
	
}
