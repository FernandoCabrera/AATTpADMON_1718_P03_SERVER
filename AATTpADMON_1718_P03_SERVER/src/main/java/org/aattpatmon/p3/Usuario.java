package org.aattpatmon.p3;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String user;
	private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    
    public Usuario(String us,String n,String a1,String a2,String ni){
    	user=us;
        nombre=n;
        apellido1=a1;
        apellido2=a2;
        nif=ni;
    }
    
    public Usuario(){
    	user="";
        nombre="";
        apellido1="";
        apellido2="";
        nif="";
    }
    

	@Override
    public String toString(){
        return user+" "+nombre+" "+apellido1+" "+apellido2+" "+nif;
    }

    public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
          
}

