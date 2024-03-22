package org.konecte.BackKonecte.service;

import java.util.ArrayList;

import org.konecte.BackKonecte.model.MasterModel;
import org.konecte.BackKonecte.model.UsuarioModel;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	public final ArrayList<UsuarioModel> list = new ArrayList<UsuarioModel>();
	
	public UsuarioService() {
		list.add( new UsuarioModel("Ernesto Sepulveda",  "5545400686", "ernesto@hotmail.com", "Contrasena1$") );
		list.add( new UsuarioModel("Abraham Ruiz","5467895649", "abraham@hotmail.com", "Contrasena1$") );
		list.add( new UsuarioModel("Eduardo Diaz","6787456790", "eduardo@hotmail.com","Contrasena1$") );
		list.add( new UsuarioModel("Joel Solis","4567892345", "joel@hotmail.com","Contrasena1$") );
		
		
	}//constructor
	public ArrayList<UsuarioModel> getAllUsuarios() {
		return list;
	}//get all usuarios

	public UsuarioModel getUsuario(int usuarioId) {
		UsuarioModel tmpUsu = null;
		for (UsuarioModel usuario : list) {
			if(usuario.getId() == usuarioId){
				tmpUsu=usuario;
				break;
			}//if ==
		}//foreach
		return tmpUsu;
	}

	public UsuarioModel addUsuario(UsuarioModel usuario) { //Get es igual a add
		UsuarioModel tmpUsu=null;
		if(list.add(usuario)) {
			tmpUsu=usuario;
		}//if
		return tmpUsu;
	}

	public UsuarioModel updateUsuario(int usuarioId, String nombreUsuario, String telUsuario, String correoUsuario,
			String contrasena) {
		UsuarioModel tmpUsu = null;
		for (UsuarioModel usuario : list) {
			if(usuario.getId() == usuarioId){
				tmpUsu=usuario;
				if(nombreUsuario.length()!=0) usuario.setNombreUsuario(nombreUsuario);
				if(telUsuario.length()!=0) usuario.setTelUsuario(telUsuario);
				if(correoUsuario.length()!=0) usuario.setCorreoUsuario(correoUsuario);
				if(contrasena.length()!=0) usuario.setContrasena(contrasena);
				
				tmpUsu=usuario;
				break;
			}//if ==
		}//foreach
		return tmpUsu;
	}

	public UsuarioModel deleteUsuario(int usuarioId) {
		UsuarioModel tmpUsu = null;
		for (UsuarioModel usuario : list) {
			if(usuario.getId() == usuarioId){
				tmpUsu=usuario;
				list.remove(tmpUsu); // borra el usuario en la lista
				break;
			}//if ==
		}//foreach
		return tmpUsu;
	}
	

}
