package org.konecte.BackKonecte.model;

public class OficioModel {

	private int id;
	private String nombreOficio;

	public OficioModel(int id, String nombreOficio) {
		super();
		this.id = id;
		this.nombreOficio = nombreOficio;
	}//constructor

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
