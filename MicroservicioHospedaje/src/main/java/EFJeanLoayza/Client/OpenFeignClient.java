package EFJeanLoayza.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EFJeanLoayza.Dto.Turista;



@FeignClient(name = "idat-turista", url="localhost:8080")
public interface OpenFeignClient {

	
	@GetMapping("/turista/v1/listar")
	public List<Turista> listarTuristasSeleccionados();
}
