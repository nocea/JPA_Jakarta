package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Coleccion;


public interface Interfaz_Coleccion {
	public void InsertColecion(Coleccion coleccion,EntityManager em);
	public List<Coleccion> SelectAllColecion(EntityManager em);
	public Coleccion SelectOneColecion(long id_coleccion,EntityManager em) ;
	public void DeleteColecion(long id_coleccion,EntityManager em);
	public void UpdateColecion(long id_coleccion,EntityManager em);
}
