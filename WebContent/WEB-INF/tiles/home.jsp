<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>

	<center>${hello}
		<br> <br> 
		     <a href="${pageContext.request.contextPath}/from">Create Offer</a> <br>
			 <a href="${pageContext.request.contextPath}/list">List of offer</a> <br>
			 <a href="${pageContext.request.contextPath}/createaccount">Create new user</a>
			 <br>
			
	</center>
