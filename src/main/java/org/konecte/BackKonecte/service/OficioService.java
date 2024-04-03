package org.konecte.BackKonecte.service;

import java.util.ArrayList;

import org.konecte.BackKonecte.model.OficioModel;
import org.springframework.stereotype.Service;
@Service
public class OficioService {
	
	public final ArrayList<OficioModel> list = new ArrayList<OficioModel>();
	
	public OficioService() {
		list.add(new OficioModel(1,"Carpinteria"));
		list.add(new OficioModel(2,"Satreria"));
		list.add(new OficioModel(3,"Albañileria"));
	}
	
	
	public ArrayList<OficioModel> getAllOficios() {
		return list;
	}
	
	public OficioModel getOficio(int oficioId) {
		OficioModel tmpOfi = null;
		for (OficioModel oficio : list) {
			if(oficio.getId() == oficioId) {
				tmpOfi=oficio;
				break;
			}//if ==
		}//foreach
		return tmpOfi;
	}//get 1 oficio

	//POST
	public OficioModel addOficio(OficioModel oficio) {
		OficioModel tmpOfi=null;
		if(list.add(oficio)) {
			tmpOfi=oficio;
		}
		return tmpOfi;
	}
	
	//PUT-UPDATE
	public OficioModel updateOficio(int oficioId, String nombreOficio) {
		OficioModel tmpOfi = null;
		for (OficioModel oficio: list) {
			if(oficio.getId( )== oficioId) {
				tmpOfi=oficio;
				if(nombreOficio.length()!=0)oficio.setNombreOficio(nombreOficio);
				
				tmpOfi=oficio;
			}break;
		}
		return tmpOfi;
	}
	
	//DELETE
	public OficioModel deleteOficio(int oficioId) {
		OficioModel tmpOfi = null;
		for (OficioModel oficio: list) {
			if(oficio.getId()==oficioId) {
				tmpOfi=oficio;
				list.remove(tmpOfi);
				break;
			}
		}
		return tmpOfi;
	}

	
}
