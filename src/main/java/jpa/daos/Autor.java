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
import jakarta.persistence.Table;

@Entity
@Table(name="autores",schema="gbp_operacional")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_autor")
	private long id_autor;
	@Column(name="nombre_autor")
	private String nombre_autor;
	@Column(name="apellidos_autor")
	private String apellidos_autor;
	@ManyToMany(mappedBy = "listaAutores")
    List<Libro> listaLibros;
	public Autor(long id_autor, String nombre_autor, String apellidos_autor) {
		super();
		this.id_autor = id_autor;
		this.nombre_autor = nombre_autor;
		this.apellidos_autor = apellidos_autor;
	}
	public Autor() {super();}

}
