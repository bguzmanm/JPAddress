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
<h2>Editar Dirección</h2>
<main>
  <form class="form" name="address" action="${pageContext.request.contextPath}/address/edit/" method="post">
    <input type="hidden" name="address" id="city_id" value="${address.getAddress_id()}">
    <div class="mb-3">
      <label for="address" class="form-label">Dirección</label>
      <input type="text" class="form-control" id="address" name="address" placeholder="Av. Libertador Bernardo O'Higgins" value="${address.getAddress()}">
    </div>
    <div class="mb-3">
      <label for="address2" class="form-label">Dirección 2</label>
      <input type="text" class="form-control" id="address2" name="address2" placeholder="Av. Libertador Bernardo O'Higgins" value="${address.getAddress2()}">
    </div>
    <div class="mb-3">
      <label for="district" class="form-label">Distrito</label>
      <input type="text" class="form-control" id="district" name="district" placeholder="Av. Libertador Bernardo O'Higgins" value="${address.getDistrict()}">
    </div>
    <div class="mb-3">
      <label for="country" class="form-label">País</label>

      <select class="form-select" id="country" name="country">
      <c:forEach var="country" items="${countrys}">
        <c:if test="${country.getCountry_id() == address.getCity().getCountry().getCountry_id()}">
          <option selected id="${country.getCountry_id()}" value="${country.getCountry_id()}">${country.getCountry()}</option>
        </c:if>
        <c:if test="${country.getCountry_id() != address.getCity().getCountry().getCountry_id()}">
          <option id="${country.getCountry_id()}" value="${country.getCountry_id()}">${country.getCountry()}</option>
        </c:if>
        </c:forEach>
      </select>
    </div>
    <div class="mb-3">
      <label for="city" class="form-label">Ciudad</label>

      <select class="form-select" id="city" name="city">
      <c:forEach var="city" items="${citys}">
        <c:if test="${city.getCity_id() == address.getCity().getCity_id()}">
          <option selected id="${city.getCity_id()}" value="${city.getCity_id()}">${city.getCity()}</option>
        </c:if>
        <c:if test="${city.getCity_id() != address.getCity().getCity_id()}">">
          <option id="${city.getCity_id()}" value="${city.getCity_id()}">${city.getCity()}</option>
        </c:if>
        </c:forEach>
      </select>
    </div>
    <div class="mb-3">
      <label for="postal_code" class="form-label">Distrito</label>
      <input type="text" class="form-control" id="postal_code" name="postal_code" value="${address.getPostal_code()}">
    </div>
    <div class="mb-3">
      <button class="btn btn-primary" type="submit" id="guardar">Guardar</button>
      <button type="reset" class="btn btn-secondary" id="limpiar">Limpiar</button>
    </div>
  </form>
</main>

</body>
</html>
