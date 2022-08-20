package EFJeanLoayza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFJeanLoayza.Model.HospedajeDetalle;

@Repository
public interface HospedajeTuristaRepository extends JpaRepository<HospedajeDetalle, Integer> {

}
