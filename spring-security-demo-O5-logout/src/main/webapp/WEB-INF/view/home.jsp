<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring Security</title>
</head>
<body>
	<h1>Welocome to Spring security</h1>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST" class="form-horizontal">
		<input type="submit" value="logout" />
	</form:form>
</body>
</html>