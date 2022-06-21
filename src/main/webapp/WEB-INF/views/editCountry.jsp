<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 20-06-22
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp"%>
<h2>Editar ${country.getCountry()}</h2>
<main>
  <form class="form" name="country" action="${pageContext.request.contextPath}/countrys/edit/" method="post">
    <input type="hidden" name="country_id" id="country_id" value="${country.getCountry_id()}">
    <div class="mb-3">
      <label for="country" class="form-label">Nombre</label>
      <input type="text" class="form-control" id="country" name="country" placeholder="Chile" value="${country.getCountry()}">
    </div>
    <div class="mb-3">
      <button class="btn btn-primary" type="submit" id="guardar">Guardar</button>
      <button type="reset" class="btn btn-secondary" id="limpiar">Limpiar</button>
    </div>
  </form>
</main>

</body>
</html>
