package EFJeanLoayza.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EFJeanLoayza.Dto.Hospedaje;



@FeignClient(name = "idat-hospedaje", url="localhost:8090")
public interface OpenFeignClient {

	
	@GetMapping("/hospedaje/v1/listar")
	public List<Hospedaje> listarHospedajesSeleccionados();
}
