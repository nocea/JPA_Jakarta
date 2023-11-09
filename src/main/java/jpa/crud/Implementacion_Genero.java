package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Genero;
import jpa.daos.Usuario;

public class Implementacion_Genero implements Interfaz_Genero{

	@Override
	public void InsertGenero(Genero genero, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(genero);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Genero> SelectAllGenero(EntityManager em) {
		List<Genero> listaGenero = null;
		try {
			listaGenero=em.createQuery("SELECT a FROM Genero a", Genero.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaGenero;
	}

	@Override
	public Genero SelectOneGenero(long id_genero, EntityManager em) {
		Genero genero=null;
		try {
			genero=em.find(Genero.class, id_genero);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return genero;
	}

	@Override
	public void DeleteGenero(long id_genero, EntityManager em) {
		try {
			em.getTransaction().begin();
			Genero genero=em.find(Genero.class, id_genero);
			em.remove(genero);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateGenero(long id_genero, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Genero genero=em.find(Genero.class,id_genero);
			System.out.print("Cambio dni_usuario:");
			genero.setNombre_genero(scan.next());
			em.merge(genero);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
