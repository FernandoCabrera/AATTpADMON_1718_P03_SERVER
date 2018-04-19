package org.aattpatmon.p3;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	//Inyectará, como una instancia de dao, un bean de una clase que implemente el interfaz DAOUsuariosInterfaz
		@Autowired
		private DAOUsuarioInterface dao;
	
	//Anotación para asignar solicitudes web a métodos en clases de manejo de solicitudes con firmas de métodos flexibles.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale,Model model) {
		
		return "home";
	}
	//Añadimos los servlets
	
	//Anotación para asignar solicitudes web a métodos en clases de manejo
	//de solicitudes con firmas de métodos flexibles.
	@RequestMapping(value = "/Servlet1", method = {RequestMethod.GET,RequestMethod.POST})
	public String Servlet1  (HttpServletRequest request, Model model) {
		//Este servlet tendrá la función de autentificación con la BBDD
		
		 //Hay que comprobar si el usuario esta en bbdd
		 //Variables donde vamos a guardar los atributos introducidos en la url
		String usu,pass;	
		 
	     usu = request.getParameter("user");
	     pass = request.getParameter("pass"); 
	     
	     
		//URL 
		String url="";
		
	
	        
	    //Creamos objeto   
		DAOUsuarioJDBC jdbc =new DAOUsuarioJDBC();
			
			List <Usuario> lista = dao.muestraUser();
			//comprobamos que  usuario y pass estan en el sistema
	       if(jdbc.buscaUsuario(usu, pass) !=null ){
	        	//if(usu.equals("fcabrerac")&& pass.equals("21025161X")) { 
	        		// ejemplo
	    	   
	    	   	//si coincide usuario y password 
	            //Muestro el jsp con la info de bddd
	        	//Por tanto hay que recorrer la lista
	        	
	        	for(int i=0;i<lista.size();i++) {
	        		//Empleamos model.addAttribute en vez de req.setAttribute para  agregar el atributo 
	        			model.addAttribute("user", lista.get(i).getUser());
	        			//model.addAttribute("nombre", lista.get(i).getNombre());
	        			//model.addAttribute("apellido1", lista.get(i).getApellido1());
	        			//model.addAttribute("apellido2",lista.get(i).getApellido2());
	        			model.addAttribute("nif", lista.get(i).getNif());
	        			url="usuarios";
	        			//Hay que ponerlo asi porque el servlet.context esta puesto prefix /WEB-INF/views/
			        	//Sufifix .jsp
	        			
	        			model.addAttribute("lista", lista);
	    		
	        	}	
	 }else{
	        	//Caso que no coincidan volvemos a home jsp
	        	
			 url="registro";
			
		
		}	
	        	
	        	 
	        
	        //Devolvemos la url
	        return url;
	        
		
	
}
	

}