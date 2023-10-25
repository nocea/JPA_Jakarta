package jpa.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "Accesos",schema="gbp_operacional")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_acceso",nullable=false)
	private Long id;
	@Column(name = "codigo_acceso")
	private String codigo;
	@Column(name = "descripcion_acceso")
	private String descripcion;
	@OneToMany(mappedBy = "acceso")
	List<Usuario>accesoDeUsuario;
	public Acceso(Long id, String codigo, String descripcion, List<Usuario> accesoDeUsuario) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.accesoDeUsuario = accesoDeUsuario;
	}
	public Acceso() {
		super();
	}

}
