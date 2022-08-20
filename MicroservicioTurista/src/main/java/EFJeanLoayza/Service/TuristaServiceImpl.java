package EFJeanLoayza.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EFJeanLoayza.Model.Turista;
import EFJeanLoayza.Repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	@Autowired
	private TuristaRepository repository;
	
	
	@Override
	public List<Turista> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Turista ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Turista turista) {
		// TODO Auto-generated method stub
		repository.save(turista);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(Turista turista) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(turista);
	}
	
	
	

}
