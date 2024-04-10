package org.konecte.BackKonecte.service;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.konecte.BackKonecte.Repository.UsuarioRepository;
import org.konecte.BackKonecte.dto.ChangePassword;
import org.konecte.BackKonecte.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	public final UsuarioRepository usuarioRepository ; //posiblemente haya que cambiarlo por private final 00:24:27 v2
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
	
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
		}//if  existById
		return tmpUsu;
	}// deleteUser
	
	public UsuarioModel addUsuarioModel(UsuarioModel usuario) { //Get es igual a add
		Optional<UsuarioModel> tmpUsu = usuarioRepository.findBycorreoUsuario(usuario.getCorreoUsuario());
		if (tmpUsu.isEmpty()) {
			usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
			return usuarioRepository.save(usuario);
		}else {
			System.out.println("Ya existe el usuario con el correo [" +
		usuario.getCorreoUsuario() + "]");
			return usuario;
		}//if
	}// post o add
	

	public UsuarioModel updateUsuarioModel(Long usuarioId, ChangePassword changePassword) {
		UsuarioModel tmpUsu = null;
		if(usuarioRepository.existsById(usuarioId)) {
			tmpUsu = usuarioRepository.findById(usuarioId).get();	
			if(passwordEncoder.matches(changePassword.getPassword(), tmpUsu.getPassword())) {	
				tmpUsu.setPassword(passwordEncoder.encode(changePassword.getNpassword()));
				usuarioRepository.save(tmpUsu);
			}else {
				System.out.println("updateUsuario - el password del usuario [" +
			tmpUsu.getId() + "] no coincide");
			tmpUsu=null;
		}//if 
	}// if 
		return tmpUsu;	
	}//update

	public boolean validateUsuario(UsuarioModel usuario) {
		Optional<UsuarioModel>usuarioBycorreoUsuario=usuarioRepository.findBycorreoUsuario(usuario.getCorreoUsuario());
		if (usuarioBycorreoUsuario.isPresent()) {
			UsuarioModel tmpUsu = usuarioBycorreoUsuario.get();
			//if (usuario.getPassword().equals(tmpUsu.getPassword())){
			if(passwordEncoder.matches (usuario.getPassword(), tmpUsu.getPassword())) {
				
				 return true; // Retorna true si la contraseña coincide

			}//if
		}//if isPresent
		return false;
	}//validateUser

}// class UserService
