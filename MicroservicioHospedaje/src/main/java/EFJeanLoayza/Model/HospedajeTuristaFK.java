package EFJeanLoayza.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class HospedajeTuristaFK  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1247762789539844648L;

	@Column(name="id_hospedaje", nullable = false, unique = true)
	private Integer idHospedaje;
	
	@Column(name="id_turista", nullable = false, unique = true)
	private Integer idTurista;

}
