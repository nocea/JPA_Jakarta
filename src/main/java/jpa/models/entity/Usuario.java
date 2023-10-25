package jpa.models.entity;
import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuarios",schema="gpb_operacional")
public class Usuario  {
	// Esto le da el valor de pk.
	@Id
	// esto le dice que sea auto incrementado.
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	// @Column(name="nombre de la columna de la base de datos")
	@Column(name = "id_usuario")
	private Long id;
	@Column(name = "dni_usuario")
	private String dni;
	@Column(name = "nombre_usuario")
	private String nombre;
	@Column(name = "apellidos_usuario")
	private String apellidos;
	@Column(name = "tlf_usuario")
	private String telefono;
	@Column(name = "email_usuario")
	private String email;
	@Column(name = "clave_usuario")
	private String clave;
	@Column(name = "id_acceso")
	private int idAcceso;
	@Column(name = "estaBloqueado_usuario")
	private Boolean estaBloqueado;
	@Column(name = "fch_fin_bloqueo_usuario")
	private Timestamp fechaFinBloqueo;
	@Column(name = "fch_baja_usuario")
	private Timestamp fechaBaja;
	@Column(name = "fch_alta_usuario")
	private Timestamp fechaAlta;
	@ManyToOne
	@JoinColumn(name="id_acceso")
	Acceso acceso;
	public Usuario(Long id, String dni, String nombre, String apellidos, String telefono, String email, String clave,
			int idAcceso, Boolean estaBloqueado, Timestamp fechaFinBloqueo, Timestamp fechaBaja, Timestamp fechaAlta,
			Acceso acceso) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.clave = clave;
		this.idAcceso = idAcceso;
		this.estaBloqueado = estaBloqueado;
		this.fechaFinBloqueo = fechaFinBloqueo;
		this.fechaBaja = fechaBaja;
		this.fechaAlta = fechaAlta;
		this.acceso = acceso;
	}
	public Usuario() {
		super();
	}
}
