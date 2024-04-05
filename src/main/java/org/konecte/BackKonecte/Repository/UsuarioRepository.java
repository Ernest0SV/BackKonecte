package org.konecte.BackKonecte.Repository;

import java.util.Optional;

import org.konecte.BackKonecte.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>  {
	Optional<UsuarioModel> findBycorreoUsuario(String correoUsuario);
}
