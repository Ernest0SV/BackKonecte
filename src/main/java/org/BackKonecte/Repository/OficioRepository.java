package org.BackKonecte.Repository;

import java.util.Optional;

import org.konecte.BackKonecte.model.OficioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficioRepository extends JpaRepository <OficioModel, String> {
	Optional<OficioModel> findById(String Id);
}


