<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<title>Spring Security</title>
</head>
<body>
	<h1>Welocome to Spring security</h1>

	<pre>
		User 		: <security:authentication property="principal.username"/>
		Password	: <security:authentication property="principal.password"/>
		Role(s)		: <security:authentication property="principal.authorities"/>
		
	
	</pre>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST" class="form-horizontal">
		<input type="submit" value="logout" />
	</form:form>
</body>
</html>