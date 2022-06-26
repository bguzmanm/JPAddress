<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 25-06-22
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/estilo.css">
    <script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="wrapper fadeInDown">

        <%
            String error = (String) request.getAttribute("error");
            if (error != null && error.equals("true")){
                out.println("<h3>ERROR DE AUTENTICACIÓN</H3>");
            }

        %>
        <form name="loginForm" action="${pageContext.request.contextPath}/login" method="post">
            <div id="formContent">
                <!-- Tabs Titles -->

                <!-- Icon -->
                <div class="fadeIn first">
                    <img src="${pageContext.request.contextPath}/res/img/login.jpg" id="icon" alt="User Icon"/>
                </div>

                <!-- Login Form -->
                <form>
                    <input type="text" id="username" class="fadeIn second" name="username" placeholder="nombre de usuario">
                    <input type="password" id="password" class="fadeIn third" name="password" placeholder="contraseña">
                    <input type="submit" class="fadeIn fourth" value="Log In">
                </form>

                <!-- Remind Passowrd -->
                <div id="formFooter">
                    <a class="underlineHover" href="#">Perdiste tu password?</a>
                </div>

            </div>
        </form>
    </div>
</div>
</body>
</html>
