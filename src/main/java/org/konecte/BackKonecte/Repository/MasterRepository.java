package org.konecte.BackKonecte.Repository;

import java.util.Optional;

import org.konecte.BackKonecte.model.MasterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends JpaRepository<MasterModel, Long> {
	Optional<MasterModel > findBycorreoMaster(String correoMaster);
	
}//Interface MasterModelRepository
