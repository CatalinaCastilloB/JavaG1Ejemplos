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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<!DOCTYPE html>
<html>
<head>
    <title>Registro</title>
</head>
<body>

    <div>

        <form action=""  method = "Post">
            <label for="Nombre"> Nombre:</label>
            <input type="text" id="Nombre" name="Nombre">
            <br>
            <label for="Apellido"> Apellido:</label>
            <input type="text" id="Apellido" name="Apellido">
            <br>
            <label for="Edad"> Edad:</label>
            <input type="number" id="Edad" name="Edad">
            <br>
            <input type="submit" value ="Registrar">
            <input type="button" value="enviar">
        </form>
    </div>


</body>
</html>
