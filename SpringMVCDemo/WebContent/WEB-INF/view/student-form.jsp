<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name : <form:input path="lastName"/>
			<br><br>
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
			</form:select>
			<br><br>
			C++<form:radiobutton path="favlang" value="C++"/>
			Go<form:radiobutton path="favlang" value="Go"/>
			Java<form:radiobutton path="favlang" value="Java"/>
			<br><br> 
			Operating Systems<form:checkbox path="os" value="linux"/>Linux
			<form:checkbox path="os" value="Windows"/>Windows
			<br><br>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>