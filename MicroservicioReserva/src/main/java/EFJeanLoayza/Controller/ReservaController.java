package EFJeanLoayza.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import EFJeanLoayza.Model.Reserva;
import EFJeanLoayza.Service.ReservaService;



@Controller
@RequestMapping("/reserva/v1")
public class ReservaController {
	
	@Autowired
	private ReservaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Reserva> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Reserva obtener(@PathVariable Integer id){
		return service.ObtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void>  guardar(@RequestBody Reserva reserva) {
		service.guardar(reserva);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Reserva reserva) {
		service.actualizar(reserva);
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Reserva reserva= service.ObtenerId(id);
		if(reserva != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}		
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarReservaaHospedaje() {
		service.asignarReservaaHospedaje(); 
		
	}

	

}
