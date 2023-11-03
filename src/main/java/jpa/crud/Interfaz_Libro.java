package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Libro;

public interface Interfaz_Libro {
	public void InsertLibro(Libro libro,EntityManager em);
	public List<Libro> SelectAllLibro(EntityManager em);
	public Libro SelectOneLibro(long id_libro,EntityManager em) ;
	public void DeleteLibro(long id_libro,EntityManager em);
	public void UpdateLibro(long id_libro,EntityManager em);
}
