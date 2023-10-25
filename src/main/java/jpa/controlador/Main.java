package jpa.controlador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpa.models.entity.Acceso;

public class Main {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	Acceso acceso = new Acceso("Usu","Acceso usuarios biblioteca");
	Acceso acceso2 = new Acceso("Emp","Empleados biblioteca");
	em.persist(acceso);
	em.persist(acceso2);
	em.getTransaction().commit();
	em.close();
}
