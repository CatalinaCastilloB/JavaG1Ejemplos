<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 13-06-2022
  Time: 12:45
  To change this template use File | Settings | File Templates.

  Este documento es el que crea frontend
--%>
<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Catalina del Carmen Castillo Belmar</title>
</head>
<body>
 <h1>Hola <c:out value="${Apellidos}"></c:out></h1> <%-- ${}: place holder--%>
    <p><c:out value="${edad}"></c:out></p>
    <br>
    <p><c:out value="edad"></c:out></p>
    <br>
    <p><c:out value="${Usuario.getNombre()} ${Usuario.toString()}"></c:out></p>
</body>
</html>

