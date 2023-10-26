package jpa.daos;
import jpa.daos.Libro;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rel_autores_libros", schema = "gbp_operacional")
public class Rel_Autores_Libros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_rel_autores_libros")
	private long id_rel_autores_libros;
	@ManyToOne()
	@JoinColumn(name="id_libro")
	Libro libro;
	public Rel_Autores_Libros(Libro libro) {
		super();
		this.libro = libro;
	}
	public Rel_Autores_Libros() {
		super();
		
	}
}
