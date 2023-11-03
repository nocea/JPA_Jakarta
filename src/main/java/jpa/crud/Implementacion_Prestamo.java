package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Prestamo;
import jpa.daos.Usuario;

public class Implementacion_Prestamo implements Interfaz_Prestamo{

	@Override
	public void InsertPrestamo(Prestamo prestamo, EntityManager em) {
		try {
		em.getTransaction().begin();
		em.persist(prestamo);
		em.getTransaction().commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}

	@Override
	public List<Prestamo> SelectAllPrestamo(EntityManager em) {
		List<Prestamo> listaPrestamos = null;
		try {
			listaPrestamos=em.createQuery("SELECT a FROM Prestamo a", Prestamo.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaPrestamos;
	}

	@Override
	public Prestamo SelectOnePrestamo(long id_prestamo, EntityManager em) {
		Prestamo prestamo=null;
		try {
			prestamo=em.find(Prestamo.class, id_prestamo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return prestamo;
	}

	@Override
	public void DeletePrestamo(long id_prestamo, EntityManager em) {
		try {
			em.getTransaction().begin();
			Prestamo prestamo=em.find(Prestamo.class, id_prestamo);
			em.remove(prestamo);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void UpdatePrestamo(long id_prestamo, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Prestamo prestamo=em.find(Prestamo.class,id_prestamo);
			System.out.print("Cambio id_prestamo:");
			prestamo.setId_prestamo(scan.nextLong());
			em.merge(prestamo);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
