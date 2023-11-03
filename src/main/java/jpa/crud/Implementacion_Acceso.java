package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jpa.daos.Acceso;

public class Implementacion_Acceso implements Interfaz_Acceso {

	@Override
	public void InsertAcceso(Acceso acceso,EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(acceso);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Acceso> SelectAllAcceso(EntityManager em) {
		List<Acceso> listaAccesos = null;
		try {
			listaAccesos=em.createQuery("SELECT a FROM Acceso a", Acceso.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaAccesos;
	}
	@Override
	public Acceso SelectOneAcceso(long id_acceso,EntityManager em) {
		Acceso acceso=null;
		try {
			acceso=em.find(Acceso.class, id_acceso);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return acceso;
	}

	@Override
	public void DeleteAcceso(long id_acceso, EntityManager em) {
		try {
			em.getTransaction().begin();
			Acceso acceso=em.find(Acceso.class, id_acceso);
			em.remove(acceso);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateAcceso(long id_acceso, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Acceso acceso=em.find(Acceso.class,id_acceso);
			System.out.print("Cambio codigo_acceso:");
			acceso.setCodigo_acceso(scan.next());
			System.out.print("Cambio descripcion_acceso:");
			acceso.setDescripcion_acceso(scan.next());
			em.merge(acceso);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
