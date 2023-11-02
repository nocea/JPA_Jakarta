package jpa.daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="libros",schema="gbp_operacional")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_libro",nullable=false)
	private long id_libro;
	@Column(name="isbn_libro")
	private String isbn_libro;
	@Column(name="titulo_libro")
	private String titulo_libro;
	@Column(name="edicion_libro")
	private String edicion_libro;
	@OneToMany(mappedBy = "libro")
	List<Prestamo> listaPrestamos;
	@ManyToOne
	Coleccion coleccion;
	@ManyToOne
	Editorial editorial;
	@ManyToOne
	Genero genero;
	@ManyToMany
    @JoinTable(name = "rel_libros_autores",schema = "gbp_operacional")
    List<Autor> listaAutores;
	public Libro(String isbn_libro, String titulo_libro, String edicion_libro) {
		super();
		this.isbn_libro = isbn_libro;
		this.titulo_libro = titulo_libro;
		this.edicion_libro = edicion_libro;
	}
	public Libro() {
		super();
	}
	

}
