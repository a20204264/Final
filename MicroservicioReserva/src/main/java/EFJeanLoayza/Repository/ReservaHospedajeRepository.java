package EFJeanLoayza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFJeanLoayza.Model.ReservaDetalle;

@Repository
public interface ReservaHospedajeRepository extends JpaRepository<ReservaDetalle, Integer> {

}
