<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
       
        <title>Práctica 3</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-offset-3 col-md-6">
                <h1>Formulario de registro </h1>
                <hr /> 
                
                <form role="form" method="post" action="register">
                    <div class="form-group">
                      <label for="username">Usuario</label>
                      <input type="username" class="form-control" name="user" 
                             placeholder="Username">
                    </div>
                    
                    <div class="form-group">
                      <label for="password">Contraseña</label>
                      <input type="password" class="form-control" name="pass" 
                             placeholder="Contraseña">
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Log In</button>
                 </form>
            </div>           
        </div>    
    </body>
</html>
