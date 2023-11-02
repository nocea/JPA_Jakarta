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
@Table(name="generos",schema="gbp_operacional")
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_genero",nullable=false)
	private long id_genero;
	@Column(name="nombre_editorial")
	private String nombre_editorial;
	@OneToMany(mappedBy = "genero")
	List<Libro>listaLibros;
	public Genero(long id_genero, String nombre_editorial) {
		super();
		this.id_genero = id_genero;
		this.nombre_editorial = nombre_editorial;
	}
	public Genero() {super();}
}
