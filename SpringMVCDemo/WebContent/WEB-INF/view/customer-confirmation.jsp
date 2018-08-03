<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<title>Customer Confirmation</title>
	</head>
	<body>
		<h1>Customer Confirmation</h1>
		<br>
		${customer.firstname}  ${customer.lastname}
		<br>
		Number of Passes: ${customer.freePasses}
		<br>
		Postalcode		: ${customer.postalCode}
		<br>
		Course Code		: ${customer.courseCode}
	</body>
</html>