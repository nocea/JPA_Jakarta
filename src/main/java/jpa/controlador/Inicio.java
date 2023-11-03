package jpa.controlador;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpa.crud.Implementacion_Acceso;
import jpa.crud.Implementacion_Usuario;
import jpa.crud.Interfaz_Acceso;
import jpa.crud.Interfaz_Usuario;
import jpa.daos.Acceso;
import jpa.daos.Usuario;

public class Inicio {
//SOLAMENTE HAY PRUEBAS DEL CRUD
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		//CREACION DE ACCESOS
		Acceso acceso = new Acceso("Usu","Acceso usuarios biblioteca");
		Acceso acceso2 = new Acceso("Emp","Acceso Empleados biblioteca");
		Interfaz_Acceso Interfaz_Acceso=new Implementacion_Acceso();
		Interfaz_Acceso.InsertAcceso(acceso, em);
		Interfaz_Acceso.InsertAcceso(acceso2, em);
		Calendar fechaActual=Calendar.getInstance();//PARA PRUEBAS CON FECHA 
		//CREACION DE USUARIOS
		Usuario usu1=new Usuario("1234x","mario","nocea","12345g","mnocea@","marmarmar",false,
				fechaActual,fechaActual,fechaActual,acceso);
		Usuario usu2=new Usuario("1234x","paco","cabrera","12345g","mnocea@","marmarmar",false,
				fechaActual,fechaActual,fechaActual,acceso);
		Interfaz_Usuario Interfaz_Usuario =new Implementacion_Usuario();
		Interfaz_Usuario.InsertUsuario(usu1, em);
		Interfaz_Usuario.InsertUsuario(usu2, em);
		
		
		
		//MOSTRAR TODOS LOS USUARIOS
//		List<Usuario>listaUsuarios=Interfaz_Usuario.SelectAllUsuario(em);
//		for (int i = 0; i < listaUsuarios.size(); i++) {
//			System.out.println(listaUsuarios.get(i).toString());
//		}
		//MOSTRAR UN SOLO USUARIO
//		Usuario usuario_mostrar=Interfaz_Usuario.SelectOneUsuario(2, em);
//		System.out.println(usuario_mostrar.toString());
		//DELETE POR ID
//		Interfaz_Usuario.DeleteUsuario(2, em);
		//UPDATE POR ID
//		Interfaz_Usuario.UpdateUsuario(1, em);
		
		
		
		
		//MOSTRAR TODOS LOS ACCESOS
//		List<Acceso> listaAccesos;
//		listaAccesos=CrudIntAcceso.SelectAllAcceso(em);
//		for (int i = 0; i < listaAccesos.size(); i++) {
//			System.out.println(listaAccesos.get(i).toString());
//		}
		//MOSTRAR UN SOLO ACCESO
//		Acceso accesoMostrar=CrudIntAcceso.SelectOneAcceso(1, em);
//		System.out.println(accesoMostrar.toString());
		//DELETE POR ID
//		CrudIntAcceso.DeleteAcceso(1, em);
		//UPDATE POR ID
//		CrudIntAcceso.UpdateAcceso(1, em);
	}

}
