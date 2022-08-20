package EFJeanLoayza.Service;

import java.util.List;

import EFJeanLoayza.Model.Reserva;



public interface ReservaService {
	
	List<Reserva> listar();
	Reserva ObtenerId(Integer id);	
	void guardar(Reserva reserva);
	void eliminar(Integer id);
	void actualizar(Reserva reserva);
	void asignarReservaaHospedaje();

}
