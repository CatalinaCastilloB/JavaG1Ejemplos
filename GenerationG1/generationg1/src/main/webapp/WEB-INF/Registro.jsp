<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 13-06-2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%-- pasar info desde vista a un url(action) method="get", este es por defaoult, pero se ve en la ruta, en camvio con posts no seran visibles para el usuario --%>
<%-- submit manda inmediatamnete la informacion al apretarlo, no hay que hacer nada mas
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<%-- el id se utiliza en el frontend, en name es el que "recoge" los datos. el id es unico, en esta  vista jsp--%>
<%-- <form action="/registro/usuario"  method = "post">
            <label for="Nombre"> Nombre:</label>
            <input type="text" id="Nombre" name="NombreIng">
            <br>
            <label for="Apellido"> Apellido:</label>
            <input type="text" id="Apellido" name="ApellidoIng">
            <br>
            <label for="Edad"> Edad:</label>
            <input type="number" id="Edad" name="EdadIng">
            <br>
            <input type="submit" value ="Registrar">
            <input type="button" value="enviar">
        </form>
        --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registro</title>
</head>
<body>
    <div>

        <form:form action="/registro/usuario" method="post" modelAttribute="usuario">
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"></form:input>
            <br>
            <form:label path="apellido">Apellido:</form:label>
            <form:input path="apellido"></form:input>
            <br>
            <form:label path="edad">Edad:</form:label>
            <form:input path="edad"></form:input>
            <br>
            <form:label path="password">contrasena:</form:label>
            <form:input type="password" path="password"></form:input>
            <br>
            <input type="submit" value ="Registrar">
            <input type="button" value="enviar">

        </form:form>

        <c:if test="${msgError!=null}">
            <c:out value="${msgError}"></c:out>
        </c:if>

    </div>
</body>
</html>
