package br.usp.ime.verao.backend.repository;

import br.usp.ime.verao.backend.entity.PrateleiraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrateleiraRepository extends JpaRepository<PrateleiraEntity, Long> {

    PrateleiraEntity findById(long id);

}
