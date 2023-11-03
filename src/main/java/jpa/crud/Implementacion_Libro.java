package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Libro;



public class Implementacion_Libro implements Interfaz_Libro {

	@Override
	public void InsertLibro(Libro libro, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(libro);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Libro> SelectAllLibro(EntityManager em) {
		List<Libro> listaLibro = null;
		try {
			listaLibro=em.createQuery("SELECT a FROM Libro a", Libro.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaLibro;
	}

	@Override
	public Libro SelectOneLibro(long id_libro, EntityManager em) {
		Libro libro=null;
		try {
			libro=em.find(Libro.class, id_libro);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return libro;
	}

	@Override
	public void DeleteLibro(long id_libro, EntityManager em) {
		try {
			em.getTransaction().begin();
			Libro libro=em.find(Libro.class, id_libro);
			em.remove(libro);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateLibro(long id_libro, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Libro libro=em.find(Libro.class,id_libro);
			System.out.print("Cambio dni_usuario:");
			libro.setIsbn_libro(scan.next());
			em.merge(libro);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
