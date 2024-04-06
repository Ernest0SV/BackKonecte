package org.konecte.BackKonecte.controller;

import javax.servlet.ServletException;

import org.konecte.BackKonecte.dto.Token;
import org.konecte.BackKonecte.model.UsuarioModel;
import org.konecte.BackKonecte.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/login/")
public class LoginController {
	
	private final UsuarioService usuarioService;
	@Autowired
	public LoginController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}//constructor
	
	@PostMapping
	public Token loginUsuario(@RequestBody UsuarioModel usuario) throws ServletException {
		if (usuarioService.validateUsuario(usuario)) {
			System.out.println("Usuario válido " + usuario.getCorreoUsuario());
			return new Token("");
		}//if
		throw new ServletException("Nombre de usuario o contraseña incorrectos " + usuario.getCorreoUsuario());
	}//loginUser
	
}//class LoginController
