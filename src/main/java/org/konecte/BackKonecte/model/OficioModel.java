package org.konecte.BackKonecte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oficio")
public class OficioModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(nullable=false)
	private String nombreOficio;

	public OficioModel(String nombreOficio) {
		super();
		this.nombreOficio = nombreOficio;
	}//constructor
	
	public OficioModel() {}//constructor vacio
	

	public Long getId() {
		return id;
	}

	
	public String getNombreOficio() {
		return nombreOficio;
	}

	public void setNombreOficio(String nombreOficio) {
		this.nombreOficio = nombreOficio;
	}

	@Override
	public String toString() {
		return "OficioModel [id=" + id + ", nombreOficio=" + nombreOficio + "]";
	}
	
	
}
