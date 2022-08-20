package EFJeanLoayza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFJeanLoayza.Model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
