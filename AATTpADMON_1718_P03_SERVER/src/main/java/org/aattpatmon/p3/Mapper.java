package org.aattpatmon.p3;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//Es una clase en el que el programador implementa qu� ha de hacerse para 
//cada iteraci�n (fila), t�picamente el mapeo al DTO
public class Mapper implements RowMapper{
//este mapeo s�lo hace faltaimplementarlo una vez y los m�todos
//del DAO lo usan simplemente mediante una instancia de la clase
	
public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException{
Usuario usuario = new Usuario();
usuario.setNombre(rs.getString("Nombre"));
usuario.setApellido1(rs.getString("Apellido1"));
usuario.setApellido2(rs.getString("Apellido2"));
usuario.setNif(rs.getString("NIF"));

return usuario;
}
}
