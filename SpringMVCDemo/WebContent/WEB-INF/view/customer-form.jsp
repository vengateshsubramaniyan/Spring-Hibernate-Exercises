<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Customer Form</title>
		<style>
			.error {color:red}
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
		<pre>
			Firstname	:<form:input path="firstname"/>
			<br><br>
			Lastname(*)	:<form:input path="lastname"/>
			<form:errors path="lastname" cssClass="error"/>
			<br><br>
			FreePasses	:<form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"/>
			<br><br>
			Postalcode	:<form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			CourseCode	:<form:input path="courseCode"/>
			<form:errors path="courseCode" cssClass="error"/>
			<input type="submit" value="submit">
		</pre>
		</form:form>
	</body>
</html>