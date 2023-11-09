package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Coleccion;
import jpa.daos.Usuario;

public class Implementacion_Coleccion implements Interfaz_Coleccion {

	@Override
	public void InsertColecion(Coleccion coleccion, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(coleccion);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Coleccion> SelectAllColecion(EntityManager em) {
		List<Coleccion> listaColeccion = null;
		try {
			listaColeccion=em.createQuery("SELECT a FROM Coleccion a", Coleccion.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaColeccion;
	}

	@Override
	public Coleccion SelectOneColecion(long id_coleccion, EntityManager em) {
		Coleccion coleccion=null;
		try {
			coleccion=em.find(Coleccion.class, id_coleccion);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return coleccion;
	}

	@Override
	public void DeleteColecion(long id_coleccion, EntityManager em) {
		try {
			em.getTransaction().begin();
			Coleccion coleccion=em.find(Coleccion.class, id_coleccion);
			em.remove(coleccion);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateColecion(long id_coleccion, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Coleccion coleccion=em.find(Coleccion.class,id_coleccion);
			System.out.print("Cambio dni_usuario:");
			coleccion.setNombre_editorial(scan.next());
			em.merge(coleccion);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
