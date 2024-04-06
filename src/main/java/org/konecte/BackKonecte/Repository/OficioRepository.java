package org.konecte.BackKonecte.Repository;

import java.util.Optional;

import org.konecte.BackKonecte.model.OficioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficioRepository extends JpaRepository <OficioModel, Long> {
	//Optional<OficioModel> findById(String Id);
}

