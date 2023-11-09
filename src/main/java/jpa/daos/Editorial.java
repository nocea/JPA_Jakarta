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
	@Column(name="nombre_editorial")
	private String nombre_editorial;
	public void setNombre_editorial(String nombre_editorial) {
		this.nombre_editorial = nombre_editorial;
	}
	@Column(name="descripcion_editorial")
	private String descripcion_editorial;
	@OneToMany(mappedBy = "editorial")
	List<Libro>listaLibros;
	public Editorial(long id_editorial, String nombre_editorial, String descripcion_editorial) {
		super();
		this.id_editorial = id_editorial;
		this.nombre_editorial = nombre_editorial;
		this.descripcion_editorial = descripcion_editorial;
	}
	public Editorial() {
		super();
	}
	
}
