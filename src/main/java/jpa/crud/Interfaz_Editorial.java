package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Editorial;


public interface Interfaz_Editorial {
	public void InsertEditorial(Editorial editorial,EntityManager em);
	public List<Editorial> SelectAllEditorial(EntityManager em);
	public Editorial SelectOneEditorial(long id_editorial,EntityManager em) ;
	public void DeleteEditorial(long id_editorial,EntityManager em);
	public void UpdateEditorial(long id_editorial,EntityManager em);
}
