package EFJeanLoayza.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import lombok.Data;

@Data
@Embeddable
public class ReservaHospedajeFK implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3280290148439247203L;

	@Column(name="id_reserva", nullable = false, unique = true)
	private Integer idReserva;
	
	@Column(name="id_hospedaje", nullable = false, unique = true)
	private Integer idHospedaje;

}
