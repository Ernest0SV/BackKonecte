package org.konecte.BackKonecte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Pojo agregar
@Entity
@Table(name="master")
public class MasterModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	
	private int    id;
	private String nombreMaster;
	private String domicilioMaster;
	private String   telMaster;
	private String correoMaster;
	private String fotoMaster;
	private String contrasena;
	private String descripcion;
	private String oficio;
	private static int total=0;
	
	
	//constructor vacio
	public MasterModel() {
		
		MasterModel.total++;
		id = MasterModel.total;		
		
	}
	
	//constructor sin id, por el autoincremental	
	public MasterModel(String nombreMaster, String domicilioMaster, String telMaster, String correoMaster,
			String fotoMaster, String contrasena, String descripcion, String oficio) {
		super();
		this.nombreMaster = nombreMaster;
		this.domicilioMaster = domicilioMaster;
		this.telMaster = telMaster;
		this.correoMaster = correoMaster;
		this.fotoMaster = fotoMaster;
		this.contrasena = contrasena;
		this.descripcion = descripcion;
		this.oficio = oficio;
		MasterModel.total++;
		id = MasterModel.total;	
	}
	
	
	//sobrecarga al contructor de arriba 
	public MasterModel(int id, String nombreMaster, String domicilioMaster, String telMaster, String correoMaster,
			String fotoMaster, String contrasena, String descripcion, String oficio) {
		super();
		this.nombreMaster = nombreMaster;
		this.domicilioMaster = domicilioMaster;
		this.telMaster = telMaster;
		this.correoMaster = correoMaster;
		this.fotoMaster = fotoMaster;
		this.contrasena = contrasena;
		this.descripcion = descripcion;
		this.oficio = oficio;
		MasterModel.total++;
		id = MasterModel.total;	
	}

	
	
	
	//getters y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreMaster() {
		return nombreMaster;
	}

	public void setNombreMaster(String nombreMaster) {
		this.nombreMaster = nombreMaster;
	}

	public String getDomicilioMaster() {
		return domicilioMaster;
	}

	public void setDomicilioMaster(String domicilioMaster) {
		this.domicilioMaster = domicilioMaster;
	}

	public String getTelMaster() {
		return telMaster;
	}

	public void setTelMaster(String telMaster) {
		this.telMaster = telMaster;
	}

	public String getCorreoMaster() {
		return correoMaster;
	}

	public void setCorreoMaster(String correoMaster) {
		this.correoMaster = correoMaster;
	}

	public String getFotoMaster() {
		return fotoMaster;
	}

	public void setFotoMaster(String fotoMaster) {
		this.fotoMaster = fotoMaster;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "MasterModel [id=" + id + ", nombreMaster=" + nombreMaster + ", domicilioMaster=" + domicilioMaster
				+ ", telMaster=" + telMaster + ", correoMaster=" + correoMaster + ", fotoMaster=" + fotoMaster
				+ ", contrasena=" + contrasena + ", descripcion=" + descripcion + ", oficio=" + oficio + "]";
	}


	
	
	
	
	
}
