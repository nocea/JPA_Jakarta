package jpa.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jpa.daos.Acceso;

public interface Interfaz_Acceso {
	public void InsertAcceso(Acceso acceso,EntityManager em);
	public List<Acceso> SelectAllAcceso(EntityManager em);
	public Acceso SelectOneAcceso(long id_acceso,EntityManager em) ;
	public void DeleteAcceso(long id_acceso,EntityManager em);
	public void UpdateAcceso(long id_acceso,EntityManager em);
}
