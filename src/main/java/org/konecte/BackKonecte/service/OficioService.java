package org.konecte.BackKonecte.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.konecte.BackKonecte.Repository.OficioRepository;
import org.konecte.BackKonecte.model.MasterModel;
import org.konecte.BackKonecte.model.OficioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OficioService {
	
	public final OficioRepository oficioRepository;
	@Autowired
	public OficioService(OficioRepository oficioRepository) {
		//list.add(new OficioModel(1,"Carpinteria"));
		//list.add(new OficioModel(2,"Satreria"));
		//list.add(new OficioModel(3,"Albañileria"));
		this.oficioRepository = oficioRepository;
		
	}//constructor
	

	public List<OficioModel> getAllOficios() {
		return oficioRepository.findAll();
	}// get all oficios
	
	public OficioModel getOficioModel (String oficioId) {
		return oficioRepository.findById(oficioId).orElseThrow(
				()-> new IllegalArgumentException("El oficio con el id ["+
						oficioId + "] no existe")
				);
	}//get 1 oficio
	
	public OficioModel deleteOficioModel (String oficioId) {
		OficioModel tmpOfi = null;
		if(oficioRepository.existsById(oficioId)) {
			tmpOfi = oficioRepository.findById(oficioId).get();
			oficioRepository.deleteById(oficioId);
		}//if
		return tmpOfi;
		}//delete
	
	public OficioModel addOficioModel(OficioModel oficio) {
		Optional<OficioModel> tmpOfi= oficioRepository.findById(oficio.getNombreOficio());		
		if (tmpOfi.isEmpty()) {
			return oficioRepository.save(oficio);
		}else {
			System.out.println("Ya existe el master con el correo [" +
		oficio.getNombreOficio() + "]");
			return null;
		}//if
	}// add/post 
	
	public OficioModel updateOficio(String oficioId, String nombreOficio) {
		OficioModel oficio = null;
		//for (OficioModel oficio: list) {
			if(oficioRepository.existsById(oficioId)){
				oficio = oficioRepository.findById(oficioId).get();
				
				if(nombreOficio.length()!=0)oficio.setNombreOficio(nombreOficio);
				
				//tmpOfi=oficio;
			//}break;
		}//if
		return oficio;
	}//put 
	

}
