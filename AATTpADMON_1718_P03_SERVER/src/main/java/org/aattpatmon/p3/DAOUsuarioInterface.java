package org.aattpatmon.p3;

import java.util.List;

import org.aattpatmon.p3.Usuario;

//se recomienda organizar el acceso a una base de datos en
//componentes llamados DAOs (Objeto de Acceso a Datos)
public interface DAOUsuarioInterface {
	public Usuario buscaUsuario(String user,String nif); 
	public List<Usuario> muestraUser();
	public void addUser(String name,String surname1,String surname2,String dni);
}