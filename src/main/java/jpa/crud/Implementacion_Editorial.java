package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Editorial;
import jpa.daos.Usuario;

public class Implementacion_Editorial implements Interfaz_Editorial{

	@Override
	public void InsertEditorial(Editorial editorial, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(editorial);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Editorial> SelectAllEditorial(EntityManager em) {
		List<Editorial> listaEditorial = null;
		try {
			listaEditorial=em.createQuery("SELECT a FROM Editorial a", Editorial.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaEditorial;
	}

	@Override
	public Editorial SelectOneEditorial(long id_editorial, EntityManager em) {
		Editorial editorial=null;
		try {
			editorial=em.find(Editorial.class, id_editorial);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return editorial;
	}

	@Override
	public void DeleteEditorial(long id_editorial, EntityManager em) {
		try {
			em.getTransaction().begin();
			Editorial editorial=em.find(Editorial.class, id_editorial);
			em.remove(editorial);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateEditorial(long id_editorial, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Editorial editorial=em.find(Editorial.class,id_editorial);
			System.out.print("Cambio dni_usuario:");
			editorial.setNombre_editorial(scan.next());
			em.merge(editorial);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
