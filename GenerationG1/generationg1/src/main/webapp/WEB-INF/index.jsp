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
 <h1>Hola <c:out value="${usuario.getNombre()} ${usuario.getApellido()}"></c:out></h1> <%-- ${}: place holder--%>
    <p><c:out value="Su edad es: ${usuario.getEdad()}"></c:out></p>
    <br>
    <p><c:out value="edad"></c:out></p>
    <br>
    <p><c:out value="${usuario.getNombre()} ${usuario.getApellido()} ${usuario.getEdad()}"></c:out></p>
    <br>
 <p><c:out value="________00000000000___________000000000000_________"></c:out></p>
 <p> <c:out value="______00000000_____00000___000000_____0000000______"></c:out></p>
 <p> <c:out value="____0000000_____________000______________00000_____"></c:out></p>
 <p> <c:out value="___0000000_______________0_________________0000____"></c:out></p>
 <p> <c:out value=" __000000____________________________________0000___"></c:out></p>
 <p> <c:out value=" __00000_____________________________________ 0000__"></c:out></p>
 <p> <c:out value="  _00000______________________________________00000__"></c:out></p>
 <p> <c:out value="   _00000_____________________________________000000__"></c:out></p>
 <p> <c:out value="   __000000_________________________________0000000___"></c:out></p>
 <p> <c:out value="   ___0000000______________________________0000000____"></c:out></p>
 <p> <c:out value="    _____000000____________________________000000______"></c:out></p>
 <p> <c:out value="    _______000000________________________000000________"></c:out></p>
 <p> <c:out value="     __________00000_____________________0000___________"></c:out></p>
 <p> <c:out value="    _____________0000_________________0000_____________"></c:out></p>
 <p> <c:out value="     _______________0000_____________000________________"></c:out></p>
 <p> <c:out value="     _________________000_________000___________________"></c:out></p>
 <p> <c:out value="     _________________ __000_____00_____________________"></c:out></p>
 <p> <c:out value="     ______________________00__00_______________________"></c:out></p>
 <p> <c:out value="     ________________________00_________________________"></c:out>
    </p>
</body>
</html>

