package EFJeanLoayza.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFJeanLoayza.Model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {

}
