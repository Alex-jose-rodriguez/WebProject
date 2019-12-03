<%--
  Created by IntelliJ IDEA.
  User: alex.rodriguez
  Date: 2019-12-02
  Time: 07:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<c:if test="${!empty form.resultat}"><p><c:out value="$form.resultat"/></p></c:if>
<!--method: definimos el metodo a utilizar en la Servlet "post"-->
<!--action: es el atributo que indica al URL, la pagina que queremos llamar, despues de haber sometido este formulario.-->
<form method="post" action="/root/pages/home.jsp" >
    <!--<p>
        <%--@declare id="login"--%><label for="login">Login: </label>
        <input type="text" name="login"id="login"/>
    </p>
    <p>
        <%--@declare id="pass"--%><label for="pass">Mot de passe : </label>
        <input type="password" name="pass"id="pass"/>
    </p>
    <input type="submit"/>-->

    Enter username : <input type="text" name="login"><br>
    Enter password : <input type="password" name="pass"><br>
    <input type="submit" value="login">
</form>
</body>
</html>