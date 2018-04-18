package org.aattpatmon.p3;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//Es una clase en el que el programador implementa qu� ha de hacerse para 
//cada iteraci�n (fila), t�picamente el mapeo al DTO

public class Mapper implements RowMapper<Usuario>{
//este mapeo s�lo hace faltaimplementarlo una vez y los m�todos
//del DAO lo usan simplemente mediante una instancia de la clase
	
public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException{
Usuario usuario = new Usuario();
usuario.setUser(rs.getString("Usuario"));
usuario.setNif(rs.getString("DNI"));

return usuario;
}
}
