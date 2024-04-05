package org.konecte.BackKonecte.service;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.konecte.BackKonecte.Repository.UsuarioRepository;
import org.konecte.BackKonecte.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	public final UsuarioRepository usuarioRepository ;
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
	/*	list.add( new UsuarioModel("Ernesto Sepulveda",  "5545400686", "ernesto@hotmail.com", "Contrasena1$") );
		list.add( new UsuarioModel("Abraham Ruiz","5467895649", "abraham@hotmail.com", "Contrasena1$") );
		list.add( new UsuarioModel("Eduardo Diaz","6787456790", "eduardo@hotmail.com","Contrasena1$") );
		list.add( new UsuarioModel("Joel Solis","4567892345", "joel@hotmail.com","Contrasena1$") );
	*/	
		this.usuarioRepository = usuarioRepository;
	}//constructor
	
	public List<UsuarioModel> getAllUsuarios() {
		return usuarioRepository.findAll();
	}//get all usuarios

	public UsuarioModel getUsuarioModel(Long usuarioId) {
		return usuarioRepository.findById(usuarioId).orElseThrow(
				() -> new IllegalArgumentException("El usuario con el id ["+
						usuarioId + "] no existe")
				);
	}// getUsuario
	
	public UsuarioModel deleteUsuarioModel(Long usuarioId) {
		UsuarioModel tmpUsu = null;
		//for (UsuarioModel usuario : list) {
		if(usuarioRepository.existsById(usuarioId) ) {
			tmpUsu = usuarioRepository.findById(usuarioId).get();
			usuarioRepository.deleteById(usuarioId);
		}//if 
		return tmpUsu;
	}// delete
	

	public UsuarioModel addUsuarioModel(UsuarioModel usuario) { //Get es igual a add
		Optional<UsuarioModel> tmpUsu = usuarioRepository.findBycorreoUsuario(usuario.getCorreoUsuario());
		if (tmpUsu.isEmpty()) {
			return usuarioRepository.save(usuario);
		}else {
			System.out.println("Ya existe el master con el correo [" +
		usuario.getCorreoUsuario() + "]");
			return null;
		}//if
	}// post o add

	public UsuarioModel updateUsuarioModel(Long usuarioId, String nombreUsuario, String telUsuario, String correoUsuario,
			String contrasena) {
		UsuarioModel usuario = null;
		
		// for (//UsuarioModel : list) {	
			if(usuarioRepository.existsById(usuarioId)) {
				usuario = usuarioRepository.findById(usuarioId).get();
				if(nombreUsuario.length()!=0) usuario.setNombreUsuario(nombreUsuario);
				if(telUsuario.length()!=0) usuario.setTelUsuario(telUsuario);
				if(correoUsuario.length()!=0) usuario.setCorreoUsuario(correoUsuario);
				if(contrasena.length()!=0) usuario.setContrasena(contrasena);
				
				//tmpUsu=usuario;
				//break;
			}//if ==
		//}//foreach
		return usuario;
	}


}
