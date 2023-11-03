package jpa.crud;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jpa.daos.Acceso;
import jpa.daos.Usuario;

public class Implementacion_Usuario implements Interfaz_Usuario {

	@Override
	public void InsertUsuario(Usuario usuario, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Usuario> SelectAllUsuario(EntityManager em) {
		List<Usuario> listaUsuarios = null;
		try {
			listaUsuarios=em.createQuery("SELECT a FROM Usuario a", Usuario.class).getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	@Override
	public Usuario SelectOneUsuario(long id_usuario, EntityManager em) {
		Usuario usuario=null;
		try {
			usuario=em.find(Usuario.class, id_usuario);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public void DeleteUsuario(long id_usuario, EntityManager em) {
		try {
			em.getTransaction().begin();
			Usuario usuario=em.find(Usuario.class, id_usuario);
			em.remove(usuario);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateUsuario(long id_usuario, EntityManager em) {
		try {
			Scanner scan=new Scanner(System.in);
			em.getTransaction().begin();
			Usuario usuario=em.find(Usuario.class,id_usuario);
			System.out.print("Cambio dni_usuario:");
			usuario.setDni_usuario(scan.next());
			em.merge(usuario);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
