package spring.models.entity;

import java.io.Serializable;
import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getIdAcceso() {
		return idAcceso;
	}

	public void setIdAcceso(int idAcceso) {
		this.idAcceso = idAcceso;
	}

	public Boolean getEstaBloqueado() {
		return estaBloqueado;
	}

	public void setEstaBloqueado(Boolean estaBloqueado) {
		this.estaBloqueado = estaBloqueado;
	}

	public Timestamp getFechaFinBloqueo() {
		return fechaFinBloqueo;
	}

	public void setFechaFinBloqueo(Timestamp fechaFinBloqueo) {
		this.fechaFinBloqueo = fechaFinBloqueo;
	}

	public Timestamp getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
