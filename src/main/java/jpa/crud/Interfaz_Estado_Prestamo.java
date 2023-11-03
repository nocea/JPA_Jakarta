package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Estado_Prestamo;


public interface Interfaz_Estado_Prestamo {
	public void InsertEstado_Prestamo(Estado_Prestamo estado_prestamo,EntityManager em);
	public List<Estado_Prestamo> SelectAllEstado_Prestamo(EntityManager em);
	public Estado_Prestamo SelectOneEstado_Prestamo(long id_estado_prestamo,EntityManager em) ;
	public void DeleteEstado_Prestamo(long id_estado_prestamo,EntityManager em);
	public void UpdateEstado_Prestamo(long id_estado_prestamo,EntityManager em);
}
