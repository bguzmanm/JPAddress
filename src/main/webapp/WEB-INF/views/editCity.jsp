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
<h2>Editar ${city.getCity()}</h2>
<main>
  <form class="form" name="city" action="${pageContext.request.contextPath}/citys/edit/" method="post">
    <input type="hidden" name="city_id" id="city_id" value="${city.getCity_id()}">
    <div class="mb-3">
      <label for="city" class="form-label">Nombre</label>
      <input type="text" class="form-control" id="city" name="city" placeholder="Valparaiso" value="${city.getCity()}">
    </div>
    <div class="mb-3">
      <label for="country" class="form-label">Nombre</label>

      <select class="form-select" id="country" name="country">
      <c:forEach var="country" items="${countrys}">
        <c:if test="${country.getCountry_id() == city.getCountry().getCountry_id()}">
          <option selected id="${country.getCountry_id()}" value="${country.getCountry_id()}">${country.getCountry()}</option>
        </c:if>
        <c:if test="${country.getCountry_id() != city.getCountry().getCountry_id()}">
          <option id="${country.getCountry_id()}" value="${country.getCountry_id()}">${country.getCountry()}</option>
        </c:if>
        </c:forEach>
      </select>
    </div>
    <div class="mb-3">
      <button class="btn btn-primary" type="submit" id="guardar">Guardar</button>
      <button type="reset" class="btn btn-secondary" id="limpiar">Limpiar</button>
    </div>
  </form>
</main>

</body>
</html>
