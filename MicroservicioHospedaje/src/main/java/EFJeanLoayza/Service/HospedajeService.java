package EFJeanLoayza.Service;

import java.util.List;

import EFJeanLoayza.Model.Hospedaje;



public interface HospedajeService {
	List<Hospedaje> listar();
	Hospedaje ObtenerId(Integer id);	
	void guardar(Hospedaje hospedaje);
	void eliminar(Integer id);
	void actualizar(Hospedaje hospedaje);
	void asignarTuristaHospedaje();

}
