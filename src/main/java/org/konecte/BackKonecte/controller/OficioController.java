package org.konecte.BackKonecte.controller;
//import java.util.ArrayList;
import java.util.List;
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
	public OficioController(OficioService oficioService){
		this.oficioService = oficioService;
	}
	
	@GetMapping
	public List <OficioModel>getAllOficios(){
		return oficioService.getAllOficios();
	}
	
	//GET
	//Trae solo un oficio
	@GetMapping (path="{oficioId}")
	public OficioModel getOficio(@PathVariable("oficioId")String oficioId) {
		return oficioService.getOficioModel(oficioId);
	}
	
	//POST
	@PostMapping
	public OficioModel addOficio(@RequestBody OficioModel oficio) {
		return oficioService.addOficioModel(oficio);
	}//postOficio
	
	//PUT
	@PutMapping(path="{oficioId}")//http://localhost:8080/api/oficios/1
	public OficioModel updateOficio(@PathVariable("oficioId")String oficioId,
	@RequestBody OficioModel oficio	) {
		return oficioService.updateOficio(oficioId, oficio.getNombreOficio());
}
	//DELETE
	@DeleteMapping (path="{masterId}")
	public OficioModel deleteOficio(@PathVariable("oficioId")String oficioId) {
		return oficioService.deleteOficioModel(oficioId);
	}
	
}
