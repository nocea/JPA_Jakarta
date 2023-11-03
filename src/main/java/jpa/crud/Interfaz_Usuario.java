package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Usuario;

public interface Interfaz_Usuario {
	public void InsertUsuario(Usuario usuario,EntityManager em);
	public List<Usuario> SelectAllUsuario(EntityManager em);
	public Usuario SelectOneUsuario(long id_usuario,EntityManager em) ;
	public void DeleteUsuario(long id_usuario,EntityManager em);
	public void UpdateUsuario(long id_usuario,EntityManager em);
}
