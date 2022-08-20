package EFJeanLoayza.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="reservas_hospedajes")
public class ReservaDetalle {
	
	@Id
	private ReservaHospedajeFK fk= new ReservaHospedajeFK();

}
