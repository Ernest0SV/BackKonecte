package org.konecte.BackKonecte.controller;
import java.util.List;

import org.konecte.BackKonecte.dto.ChangePassword;
import org.konecte.BackKonecte.model.UsuarioModel;
import org.konecte.BackKonecte.service.UsuarioService;
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
@RequestMapping(path="/api/usuarios/")

public class UsuarioController {
	
	private final UsuarioService usuarioService;
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	//Para traer a todos los usuarios
	@GetMapping		// http://localhost:8080/api/usuarios/
	public List<UsuarioModel> getAllUsuarios(){
		return usuarioService.getAllUsuarios();
	}
	
	//Para traer usuarios uno por uno , minimo dos gets
	//GET
	//este get es para traer un solo master
	@GetMapping (path="{usuarios}") // http://localhost:8080/api/usuarios/1
	public UsuarioModel getMaster(@PathVariable("usuarios") Long usuarioId) {
		return usuarioService.getUsuarioModel(usuarioId);
	}//get product
	
	//POST
	@PostMapping
	public UsuarioModel addUsuario(@RequestBody UsuarioModel usuario) {
		return usuarioService.addUsuarioModel(usuario);
	}//postMaster
		
		
	//PUT 2
	@PutMapping(path="{usuarioId}")  //http://localhost:8080/api/usuarios/1
	public UsuarioModel updateUsuario(@PathVariable("usuarioId") Long usuarioId,
	@RequestBody ChangePassword changePassword) {
	return usuarioService.updateUsuarioModel(usuarioId, changePassword); //Regresa todos los datos que previamente declare en el archivo de controller
	}//put master
		
		
	//DELETE
	@DeleteMapping (path="{usuarioId}") // http://localhost:8080/api/masters/1
	public UsuarioModel deleteUsuario(@PathVariable("usuarioId") Long usuarioId) {
	return usuarioService.deleteUsuarioModel(usuarioId);
	}//delete master
}
