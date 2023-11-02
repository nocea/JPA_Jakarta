package jpa.daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="colecciones",schema="gbp_operacional")
public class Coleccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_coleccion",nullable=false)
	private long id_coleccion;
	@Column(name="nombre_editorial")
	private String nombre_editorial;
	@OneToMany(mappedBy = "coleccion")
	List<Libro>listaLibros;
	public Coleccion(long id_coleccion, String nombre_editorial) {
		super();
		this.id_coleccion = id_coleccion;
		this.nombre_editorial = nombre_editorial;
	}
	public Coleccion() {
		super();
	}

}
