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
@Table(name="editoriales",schema="gbp_operacional")
public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_editorial",nullable=false)
	private long id_editorial;
	@Column(name="nombre_genero")
	private String nombre_genero;
	@Column(name="descripcion_genero")
	private String descripcion_genero;
	@OneToMany(mappedBy = "editorial")
	List<Libro>listaLibros;
	public Editorial(long id_editorial, String nombre_genero, String descripcion_genero) {
		super();
		this.id_editorial = id_editorial;
		this.nombre_genero = nombre_genero;
		this.descripcion_genero = descripcion_genero;
	}
	public Editorial() {
		super();
	}
	
}
