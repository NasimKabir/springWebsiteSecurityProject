
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-striped" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Offer</th>
		</tr>
		<c:forEach var="rows" items="${table}">
			<tr>
				<td><c:out value="${rows.id}"></c:out></td>
				<td><c:out value="${rows.name}"></c:out></td>
				<td><c:out value="${rows.email}"></c:out></td>
				<td><c:out value="${rows.text}"></c:out></td>
			</tr>
		</c:forEach>
	</table>