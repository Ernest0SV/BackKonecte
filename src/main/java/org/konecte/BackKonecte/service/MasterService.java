package org.konecte.BackKonecte.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.konecte.BackKonecte.Repository.MasterRepository;
import org.konecte.BackKonecte.model.MasterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MasterService {
	//public final ArrayList<MasterModel> list = new ArrayList<MasterModel>();
	public final MasterRepository masterRepository;
	@Autowired
	public MasterService(MasterRepository masterRepository) {
		//list.add( new MasterModel("Ernesto Sepulveda", "Calle 123", "5545400686", "ernesto@hotmail.com", "fotoErnestoBASE64", "Contrasena1$", "Soy una descripcion","Electricista") );
		//list.add( new MasterModel("Abraham Ruiz", "Calle 456", "5467895649", "abraham@hotmail.com", "fotoAbrahamBASE64", "Contrasena1$", "Soy una descripcion","Plomero") );
		//list.add( new MasterModel("Eduardo Diaz", "Oriente", "6787456790", "eduardo@hotmail.com", "fotoEduardoBASE64", "Contrasena1$", "Soy una descripcion","Carpintero") );
		//list.add( new MasterModel("Joel Solis", "Oriente 234", "4567892345", "joel@hotmail.com", "fotoJoelBASE64", "Contrasena1$", "Soy una descripcion","Plomero") );
		this.masterRepository = masterRepository;		
	}//constructor
	

	public List <MasterModel> getAllMasters() {
		return masterRepository.findAll();
	}//get all masters
	
	public MasterModel getMasterModel (Long masterId) {
		return masterRepository.findById(masterId).orElseThrow(
				()-> new IllegalArgumentException("El master con el id ["+
						masterId + "] no existe")
				);
	}// get master

	/*public MasterModel getMaster(Long masterId) {
		MasterModel tmpMast = null;
		for (masterRepository.existsById(masterId) master : list) {
			if(master.getId() == masterId){
				tmpMast=master;
				break;
			}//if ==
		}//foreach
		return tmpMast;
	}//get master
/*	public MasterModel getMasterByOficio(String oficio) {
		// TODO Auto-generated method stub
		return null;
	} */
	
/*		public MasterModel deleteMaster(int masterId) {		
			MasterModel tmpMast = null;
			for (MasterModel master : list) {
				if(master.getId() == masterId){
					tmpMast=master;
					list.remove(tmpMast); // borra el master en la lista
					break;
				}//if ==
			}//foreach
			return tmpMast;
		} */ //deleteMaster

	public MasterModel deleteMasterModel (Long masterId) {
		MasterModel tmpMaster = null;
		if(masterRepository.existsById(masterId) ) {
			tmpMaster = masterRepository.findById(masterId).get();
			masterRepository.deleteById(masterId);
		}//if
		return tmpMaster;
	}// deleteMaster
		
		
/*	public MasterModel addMaster(MasterModel master) {
		MasterModel tmpMast=null;
		if(list.add(master)) {
			tmpMast=master;
		}//if
		return tmpMast;
	} *///post
	
	public MasterModel addMasterModel (MasterModel master) {
		Optional<MasterModel> tmpMaster= masterRepository.findBycorreoMaster(master.getCorreoMaster());
		if (tmpMaster.isEmpty()) {
			return masterRepository.save(master);
		}else {
			System.out.println("Ya existe el master con el correo [" +
		master.getCorreoMaster() + "]");
			return null;
		}// if
	}// add/put product
	
	//PUT-UPDATE
	public MasterModel updateMasterMoodel(Long masterId, String nombreMaster, String domicilioMaster, String telMaster,
			String correoMaster, String fotoMaster, String contrasena, String descripcion, String oficio) {
		MasterModel master = null;
		//for (MasterModel master : list) {
			if(masterRepository.existsById(masterId)){
				master = masterRepository.findById(masterId).get();
				
				if(nombreMaster.length()!=0) master.setNombreMaster(nombreMaster);
				if(domicilioMaster.length()!=0) master.setDomicilioMaster(domicilioMaster);
				if(telMaster.length()!=0) master.setTelMaster(telMaster);
				if(correoMaster.length()!=0) master.setCorreoMaster(correoMaster);
				if(fotoMaster.length()!=0) master.setFotoMaster(fotoMaster);
				if(contrasena.length()!=0) master.setContrasena(contrasena);
				if(descripcion.length()!=0) master.setDescripcion(descripcion);
				if(oficio.length()!=0) master.setOficio(oficio);
				masterRepository.save(master);
				// tmpMast=master;
				//break;
			}
				//if ==
			
		//}//foreach
		return master;
	}

	
}// class MasterService
