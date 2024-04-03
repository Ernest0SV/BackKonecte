package org.konecte.BackKonecte.controller;

import java.util.ArrayList;

import org.konecte.BackKonecte.model.OficioModel;
import org.konecte.BackKonecte.service.OficioService;
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
@RequestMapping(path="/api/oficio")

public class OficioController {
	
	private final OficioService oficioService;
	@Autowired
	public OficioController(OficioService masterService){
		this.oficioService = oficioService;
	}
	
	@GetMapping
	public ArrayList<OficioModel>getAllOficios(){
		return oficioService.getAllOficios();
	}
	
	//GET
	//Trae solo un oficio
	@GetMapping (path="{oficioId}")
	public OficioModel getOficio(@PathVariable("oficioId")int oficioId) {
		return oficioService.getOficio(oficioId);
	}
	
	//POST
	@PostMapping
	public OficioModel addOficio(@RequestBody OficioModel oficio) {
		return oficioService.addOficio(oficio);
	}//postOficio
	
	//PUT
	@PutMapping(path="{oficioId}")//http://localhost:8080/api/oficios/1
	public OficioModel updateOficio(@PathVariable("oficioId")int oficioId,
	@RequestBody OficioModel oficio	) {
		return oficioService.updateOficio(oficioId, oficio.getNombreOficio());
}
	//DELETE
	@DeleteMapping (path="{masterId}")
	public OficioModel deleteOficio(@PathVariable("oficioId")int oficioId) {
		return oficioService.deleteOficio(oficioId);
	}
	
}
