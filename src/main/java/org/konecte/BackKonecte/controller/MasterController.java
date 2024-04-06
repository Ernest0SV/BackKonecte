package org.konecte.BackKonecte.controller;
import java.util.List;

import org.konecte.BackKonecte.dto.ChangePassword;
import org.konecte.BackKonecte.model.MasterModel;
import org.konecte.BackKonecte.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/api/masters/")

public class MasterController {
	
	private final MasterService masterService;
	@Autowired
	public MasterController(MasterService masterService) {
		this.masterService = masterService;
	}//constructor
	
	@GetMapping		// http://localhost:8080/api/masters/
	public List<MasterModel> getAllMasters(){
		return masterService.getAllMasters();
	}
	
	//GET
	//este get es para traer un solo master
	@GetMapping (path="{masterId}") // http://localhost:8080/api/masters/1
	public MasterModel getMaster(@PathVariable("masterId") Long masterId) {
		return masterService.getMasterModel(masterId);
	}//get MASTER
	
	
	/* //GET
	//este get es para traer por tipo de oficio
	@GetMapping (path="{oficio}") // http://localhost:8080/api/masters/Electricista
	public MasterModel getMasterByOficio(@PathVariable("oficio") String oficio) {
		return masterService.getMasterByOficio(oficio);
	 */ //get product

	
	//POST
	@PostMapping
	public MasterModel addMaster(@RequestBody MasterModel master) {
		return masterService.addMasterModel(master);
		}//postMaster
	
	
	//PUT 2
	@PutMapping(path="{masterId}")  //http://localhost:8080/api/masters/1
	public MasterModel updateMaster(@PathVariable("masterId") Long masterId,
	@RequestBody ChangePassword changePassword) {			
		return masterService.updateMasterMoodel(masterId, changePassword);				
				//master.getDomicilioMaster(), master.getTelMaster(),
				//master.getCorreoMaster(),master.getFotoMaster(),master.getContrasena(),
				//master.getDescripcion(),master.getOficio());
		}//put master
	
	
	
	//DELETE
	@DeleteMapping (path="{masterId}") // http://localhost:8080/api/masters/1
	public MasterModel deleteMaster(@PathVariable("masterId") Long masterId) {
		return masterService.deleteMasterModel(masterId);
		}//delete master
	
}
