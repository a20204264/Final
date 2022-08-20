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

import EFJeanLoayza.Model.Hospedaje;
import EFJeanLoayza.Service.HospedajeService;



@Controller
@RequestMapping("/hospedaje/v1")
public class HospedajeController {
	@Autowired
	private HospedajeService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Hospedaje> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Hospedaje obtener(@PathVariable Integer id){
		return service.ObtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void>  guardar(@RequestBody Hospedaje hospedaje) {
		service.guardar(hospedaje);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Hospedaje hospedaje) {
		service.actualizar(hospedaje);
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Hospedaje hospedaje= service.ObtenerId(id);
		if(hospedaje != null) {
			service.eliminar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}		
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarTuristaHospedaje() {
		service.asignarTuristaHospedaje(); 
		
	}


}
