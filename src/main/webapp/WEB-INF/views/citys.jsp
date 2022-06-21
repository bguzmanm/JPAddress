<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 17-06-22
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="head.jsp" %>
<script src="${pageContext.request.contextPath}/res/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">
<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<h2>Listado de Ciudades</h2>
<main>
    <table id="ciudades" class="table">
        <thead class="table-dark">
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>País</th>
            <th>Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="c" items="${citys}">
            <tr>
                <th><c:out value="${c.getCity_id()}"></c:out></th>
                <td><c:out value="${c.getCity()}"></c:out></td>
                <td><c:out value="${c.getCountry().getCountry()}"></c:out></td>
                <td>
                    <a href="${pageContext.request.contextPath}/citys/edit/${c.getCity_id()}"><i
                            class="fa-solid fa-pen-to-square"></i></a>
                    <a href="${pageContext.request.contextPath}/citys/del/${c.getCity_id()}"><i
                            class="fa-solid fa-trash-can"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<script>
    $(document).ready(function(){
        $("#ciudades").DataTable();

    })
</script>
</div>
</body>
</html>
