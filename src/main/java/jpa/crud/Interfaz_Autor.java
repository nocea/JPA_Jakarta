package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Autor;

public interface Interfaz_Autor {
	public void InsertAutor(Autor autor,EntityManager em);
	public List<Autor> SelectAllAutor(EntityManager em);
	public Autor SelectOneAutor(long id_autor,EntityManager em) ;
	public void DeleteAutor(long id_autor,EntityManager em);
	public void UpdateAutor(long id_autor,EntityManager em);
}
