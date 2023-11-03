package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Prestamo;


public interface Interfaz_Prestamo {
	public void InsertPrestamo(Prestamo prestamo,EntityManager em);
	public List<Prestamo> SelectAllPrestamo(EntityManager em);
	public Prestamo SelectOnePrestamo(long id_prestamo,EntityManager em) ;
	public void DeletePrestamo(long id_prestamo,EntityManager em);
	public void UpdatePrestamo(long id_prestamo,EntityManager em);
}
