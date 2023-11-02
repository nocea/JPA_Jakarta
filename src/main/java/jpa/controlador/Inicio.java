package jpa.controlador;

import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpa.crud.CrudImplAcceso;
import jpa.crud.CrudIntAcceso;
import jpa.daos.Acceso;
import jpa.daos.Usuario;

public class Inicio {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Acceso acceso = new Acceso("Usu","Acceso usuarios biblioteca");
		Acceso acceso2 = new Acceso("Emp","Acceso Empleados biblioteca");
		
		CrudIntAcceso CrudIntAcceso=new CrudImplAcceso();
		CrudIntAcceso.InsertAcceso(acceso, em);
		CrudIntAcceso.InsertAcceso(acceso2, em);
		//MOSTRAR TODOS LOS ACCESOS
//		List<Acceso> listaAccesos;
//		listaAccesos=CrudIntAcceso.SelectAllAcceso(em);
//		for (int i = 0; i < listaAccesos.size(); i++) {
//			System.out.println(listaAccesos.get(i).toString());
//		}
		//MOSTRAR UN SOLO ACCESO
//		Acceso accesoMostrar;
//		accesoMostrar=CrudIntAcceso.SelectOneAcceso(1, em);
//		System.out.println(accesoMostrar.toString());
		//DELETE POR ID
//		CrudIntAcceso.DeleteAcceso(1, em);
		//UPDATE POR ID
//		CrudIntAcceso.UpdateAcceso(1, em);
	}

}
