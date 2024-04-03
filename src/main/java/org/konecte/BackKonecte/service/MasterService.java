package org.konecte.BackKonecte.service;

import java.util.ArrayList;


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
	

	public ArrayList<MasterModel> getAllMasters() {
		return list;
	}//get all masters

	
	public MasterModel getMaster(int masterId) {
		MasterModel tmpMast = null;
		for (MasterModel master : list) {
			if(master.getId() == masterId){
				tmpMast=master;
				break;
			}//if ==
		}//foreach
		return tmpMast;
	}//get 1 master

	
	
	public MasterModel getMasterByOficio(String oficio) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	//POST
	public MasterModel addMaster(MasterModel master) {
		MasterModel tmpMast=null;
		if(list.add(master)) {
			tmpMast=master;
		}//if
		return tmpMast;
	}
	
	
	//PUT-UPDATE
	public MasterModel updateMaster(int masterId, String nombreMaster, String domicilioMaster, String telMaster,
			String correoMaster, String fotoMaster, String contrasena, String descripcion, String oficio) {
		MasterModel tmpMast = null;
		for (MasterModel master : list) {
			if(master.getId() == masterId){
				tmpMast=master;
				if(nombreMaster.length()!=0) master.setNombreMaster(nombreMaster);
				if(domicilioMaster.length()!=0) master.setDomicilioMaster(domicilioMaster);
				if(telMaster.length()!=0) master.setTelMaster(telMaster);
				if(correoMaster.length()!=0) master.setCorreoMaster(correoMaster);
				if(fotoMaster.length()!=0) master.setFotoMaster(fotoMaster);
				if(contrasena.length()!=0) master.setContrasena(contrasena);
				if(descripcion.length()!=0) master.setDescripcion(descripcion);
				if(oficio.length()!=0) master.setOficio(oficio);
				
			
				tmpMast=master;
				break;
			}//if ==
		}//foreach
		return tmpMast;
	}

	
	//DELETE
	public MasterModel deleteMaster(int masterId) {
		MasterModel tmpMast = null;
		for (MasterModel master : list) {
			if(master.getId() == masterId){
				tmpMast=master;
				list.remove(tmpMast); // borra el master en la lista
				break;
			}//if ==
		}//foreach
		return tmpMast;
	}
	
	
	
	
	
}
