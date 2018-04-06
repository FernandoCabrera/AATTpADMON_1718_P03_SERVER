package org.aattpatmon.p3;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//Es una clase en el que el programador implementa qué ha de hacerse para 
//cada iteración (fila), típicamente el mapeo al DTO
public class Mapper implements RowMapper{
//este mapeo sólo hace faltaimplementarlo una vez y los métodos
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
