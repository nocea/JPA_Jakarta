package jpa.models.entity;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "accesos",schema="gbp_operacional")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acceso",nullable=false)
	private Long id_acceso;
	@Column(name = "codigo_acceso",nullable=false)
	private String codigo_acceso;
	@Column(name = "descripcion_acceso")
	private String descripcion_acceso;
	
	@OneToMany(mappedBy = "acceso")
	List<Usuario>accesoDeUsuario;
	
	public Acceso(String codigo, String descripcion) {
		super();
		
		this.codigo_acceso = codigo;
		this.descripcion_acceso = descripcion;
		
	}
	public Acceso() {
		super();
	}

}
