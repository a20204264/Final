package EFJeanLoayza.Service;

import java.util.List;

import EFJeanLoayza.Model.Turista;



public interface TuristaService {
	
	List<Turista> listar();
	Turista ObtenerId(Integer id);	
	void guardar(Turista turista);
	void eliminar(Integer id);
	void actualizar(Turista turista);

}
