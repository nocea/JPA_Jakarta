package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Genero;

public interface Interfaz_Genero {
	public void InsertGenero(Genero genero,EntityManager em);
	public List<Genero> SelectAllGenero(EntityManager em);
	public Genero SelectOneGenero(long id_genero,EntityManager em) ;
	public void DeleteGenero(long id_genero,EntityManager em);
	public void UpdateGenero(long id_genero,EntityManager em);
}
