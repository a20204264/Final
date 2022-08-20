package EFJeanLoayza.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "turistas")
public class Turista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreTurista;
	private String nroCelular;
	private String direccion;

}
