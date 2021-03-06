<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 16-06-22
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp"%>
<h2>Listado de Paises</h2>
<main>
    <table class="table">
        <thead class="table-dark">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${countrys}">
                <tr>
                    <th><c:out value="${c.getCountry_id()}"></c:out></th>
                    <td><c:out value="${c.getCountry()}"></c:out></td>
                    <td>
                        <a href="${pageContext.request.contextPath}/countrys/edit/${c.getCountry_id()}"><i class="fa-solid fa-pen-to-square"></i></a>
                        <a href="${pageContext.request.contextPath}/countrys/del/${c.getCountry_id()}"><i class="fa-solid fa-trash-can"></i></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</main>
</div>
</body>
</html>
