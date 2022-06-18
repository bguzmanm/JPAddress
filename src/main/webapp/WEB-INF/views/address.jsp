<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 17-06-22
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp"%>
<h2>Listado de Direcciones</h2>
<main>
  <table class="table">
    <thead class="table-dark">
    <tr>
      <th>Id</th>
      <th>Direccion</th>
      <th>Direccion 2</th>
      <th>Distrito</th>
      <th>Ciudad</th>
      <th>País</th>
      <th>Codigo Postal</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="a" items="${address}">
      <tr>
        <th><c:out value="${a.getAddress_id()}"></c:out></th>
        <td><c:out value="${a.getAddress()}"></c:out></td>
        <td><c:out value="${a.getAddress2()}"></c:out></td>
        <td><c:out value="${a.getDistrict()}"></c:out></td>
        <td><c:out value="${a.getCity().getCity()}"></c:out></td>
        <td><c:out value="${a.getCity().getCountry().getCountry()}"></c:out></td>
        <td><c:out value="${a.getPostal_code()}"></c:out></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</main>
</div>
</body>
</html>
