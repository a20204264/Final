package EFJeanLoayza.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EFJeanLoayza.Client.OpenFeignClient;
import EFJeanLoayza.Dto.Hospedaje;
import EFJeanLoayza.Model.Reserva;
import EFJeanLoayza.Model.ReservaDetalle;
import EFJeanLoayza.Model.ReservaHospedajeFK;
import EFJeanLoayza.Repository.ReservaHospedajeRepository;
import EFJeanLoayza.Repository.ReservaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository repository;
	
	@Autowired
	private ReservaHospedajeRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;

	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Reserva ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Reserva reserva) {
		// TODO Auto-generated method stub
		repository.save(reserva);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(Reserva reserva) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(reserva);
		
	}

	@Override
	public void asignarReservaaHospedaje() {
		List<Hospedaje> listado= feign.listarHospedajesSeleccionados();
		ReservaHospedajeFK fk= null;
		ReservaDetalle detalle = null;
		
		for(Hospedaje hospedaje: listado) {
			
			fk=new ReservaHospedajeFK();			
			fk.setIdHospedaje(hospedaje.getIdHospedaje());
			fk.setIdReserva(1);
			
			detalle = new ReservaDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
			
		}
		
	}

}
