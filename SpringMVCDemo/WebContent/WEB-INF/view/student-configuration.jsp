<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		The Student is confirmed: ${student.firstName} ${student.lastName}
		<br><br>
		<br><br>
		Country : ${student.country}
		<br><br>
		<br><br>
		Fav lang: ${student.favlang}
		<br><br>
		OS
		<br><br>
		<ul>
		<c:forEach var="temp" items="${student.os}">
		<li>${temp}</li>
		</c:forEach>
		</ul>
	</body>
</html>