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
<h2>Listado de Ciudades</h2>
<main>
  <table class="table">
    <thead class="table-dark">
    <tr>
      <th>Id</th>
      <th>Nombre</th>
      <th>País</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${citys}">
      <tr>
        <th><c:out value="${c.getCity_id()}"></c:out></th>
        <td><c:out value="${c.getCity()}"></c:out></td>
        <td><c:out value="${c.getCountry().getCountry()}"></c:out></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</main>
</div>
</body>
</html>
