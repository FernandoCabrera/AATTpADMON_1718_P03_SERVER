<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabla usuarios</title>
</head>
<body>
<table>
<tr>
  <th><strong>Usuario</strong></th>
  <th><strong>Nombre</strong></th>
  <th><strong>Apellido1</strong></th>
   <th><strong>Apellido2</strong></th>
  <th><strong>NIF</strong></th>
</tr>
<tr>
<c:forEach items= "${lista}" var="list">
<th><c:out value="${list.user}" /></th>
<th><c:out value="${list.nombre}" /></th>
<th><c:out value="${list.apellido1}" /></th>
<th><c:out value="${list.apellido2}" /></th>
<th><c:out value="${list.nif}" /></th>
</tr>
</c:forEach>
</table>

</body>
</html>