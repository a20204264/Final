package EFJeanLoayza.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="hospedajes_turistas")
public class HospedajeDetalle {
	
	@Id
	private HospedajeTuristaFK fk= new HospedajeTuristaFK();

}
