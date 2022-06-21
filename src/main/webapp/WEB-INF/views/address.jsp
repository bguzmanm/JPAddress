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
<script src="${pageContext.request.contextPath}/res/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">
<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<h2>Listado de Direcciones</h2>
<main>
  <table id="taddress" class="table">
    <thead class="table-dark">
    <tr>
      <th>Id</th>
      <th>Direccion</th>
      <th>Direccion 2</th>
      <th>Distrito</th>
      <th>Ciudad</th>
      <th>País</th>
      <th>Codigo Postal</th>
      <th>Acciones</th>
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
        <td>
          <a href="${pageContext.request.contextPath}/address/edit/${a.getAddress_id()}"><i
                  class="fa-solid fa-pen-to-square"></i></a>
          <a href="${pageContext.request.contextPath}/address/del/${a.getAddress_id()}"><i
                  class="fa-solid fa-trash-can"></i></a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</main>
</div>
<script>
  $(document).ready(function(){
    $("#taddress").DataTable();
  })
</script>
</body>
</html>
