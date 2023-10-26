package jpa.daos;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prestamos",schema="gbp_operacional")
public class Prestamo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prestamo",nullable=false)
	private long id_prestamo;
	@Column(name="fch_inicio_prestamo")
	private Calendar fch_inicio_prestamo;
	@Column(name="fch_fin_prestamo")
	private Calendar fch_fin_prestamo;
	@Column(name="fch_entrega_prestamo")
	private Calendar fch_entrega_prestamo;
	@ManyToOne
	@JoinColumn(name="id_usuario")
	Usuario usuario;
	@ManyToOne
	@JoinColumn(name="id_estado_prestamo")
	Estado_Prestamo estado_prestamo;
	public Prestamo(Calendar fch_inicio_prestamo, Calendar fch_fin_prestamo, Calendar fch_entrega_prestamo, Usuario usuario) {
		super();
		this.fch_inicio_prestamo = fch_inicio_prestamo;
		this.fch_fin_prestamo = fch_fin_prestamo;
		this.fch_entrega_prestamo = fch_entrega_prestamo;
		this.usuario = usuario;
	}
	public Prestamo() {
		super();
	}
	
	

}
