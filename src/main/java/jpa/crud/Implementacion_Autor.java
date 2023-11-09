package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Autor;
import jpa.daos.Usuario;

public class Implementacion_Autor implements Interfaz_Autor {

	@Override
	public void InsertAutor(Autor autor, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(autor);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Autor> SelectAllAutor(EntityManager em) {
		List<Autor> listaAutor = null;
		try {
			listaAutor=em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaAutor;
	}

	@Override
	public Autor SelectOneAutor(long id_autor, EntityManager em) {
		Autor autor=null;
		try {
			autor=em.find(Autor.class, id_autor);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return autor;
	}

	@Override
	public void DeleteAutor(long id_autor, EntityManager em) {
		try {
			em.getTransaction().begin();
			Autor autor=em.find(Autor.class, id_autor);
			em.remove(autor);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateAutor(long id_autor, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Autor autor=em.find(Autor.class,id_autor);
			System.out.print("Cambio dni_usuario:");
			autor.setNombre_autor(scan.next());
			em.merge(autor);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
