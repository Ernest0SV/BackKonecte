package org.konecte.BackKonecte.controller;
import java.util.ArrayList;

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
	}
	
	@GetMapping		// http://localhost:8080/api/masters/
	public ArrayList<MasterModel> getAllMasters(){
		return masterService.getAllMasters();
	}
	
	//GET
	//este get es para traer un solo master
	@GetMapping (path="{masterId}") // http://localhost:8080/api/masters/1
	public MasterModel getMaster(@PathVariable("masterId") int masterId) {
		return masterService.getMaster(masterId);
	}//get product
	
	
	//GET
	//este get es para traer por tipo de oficio
	@GetMapping (path="{oficio}") // http://localhost:8080/api/masters/Electricista
	public MasterModel getMasterByOficio(@PathVariable("oficio") String oficio) {
		return masterService.getMasterByOficio(oficio);
	}//get product

	
	//POST
	@PostMapping
	public MasterModel addMaster(@RequestBody MasterModel master) {
		return masterService.addMaster(master);
		}//postMaster
	
	
	//PUT 2
	@PutMapping(path="{masterId}")  //http://localhost:8080/api/masters/1
	public MasterModel updateMaster(@PathVariable("masterId") int masterId,
	@RequestBody MasterModel master) {
				
		return masterService.updateMaster(masterId, master.getNombreMaster(),
				master.getDomicilioMaster(), master.getTelMaster(),
				master.getCorreoMaster(),master.getFotoMaster(),master.getContrasena(),
				master.getDescripcion(),master.getOficio());
		}//put master
	
	
	
	//DELETE
	@DeleteMapping (path="{masterId}") // http://localhost:8080/api/masters/1
	public MasterModel deleteMaster(@PathVariable("masterId") int masterId) {
		return masterService.deleteMaster(masterId);
		}//delete master
	
}
