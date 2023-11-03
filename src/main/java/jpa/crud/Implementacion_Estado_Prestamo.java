package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Estado_Prestamo;



public class Implementacion_Estado_Prestamo implements Interfaz_Estado_Prestamo{

	@Override
	public void InsertEstado_Prestamo(Estado_Prestamo estado_prestamo, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(estado_prestamo);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Estado_Prestamo> SelectAllEstado_Prestamo(EntityManager em) {
		List<Estado_Prestamo> listaEstado_Prestamo = null;
		try {
			listaEstado_Prestamo=em.createQuery("SELECT a FROM Estado_Prestamo a", Estado_Prestamo.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaEstado_Prestamo;
	}

	@Override
	public Estado_Prestamo SelectOneEstado_Prestamo(long id_estado_prestamo, EntityManager em) {
		Estado_Prestamo estado_prestamo=null;
		try {
			estado_prestamo=em.find(Estado_Prestamo.class, id_estado_prestamo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return estado_prestamo;
	}

	@Override
	public void DeleteEstado_Prestamo(long id_estado_prestamo, EntityManager em) {
		try {
			em.getTransaction().begin();
			Estado_Prestamo estado_prestamo=em.find(Estado_Prestamo.class, id_estado_prestamo);
			em.remove(estado_prestamo);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void UpdateEstado_Prestamo(long id_estado_prestamo, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Estado_Prestamo estado_prestamo=em.find(Estado_Prestamo.class,id_estado_prestamo);
			System.out.print("Cambio dni_usuario:");
			estado_prestamo.setCodigo_estado_prestamo(scan.next());
			em.merge(estado_prestamo);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
