<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/resources/js/ext-6.0.0/build/ext-all-debug.js"></script>
<script type="text/javascript" src="/resources/js/ext-6.0.0/build/classic/theme-classic/resources/theme-classic-all.css"></script> 
<!-- <script type="text/javascript"> var test = "${users}" ;	console.log(test); </script> -->
<title>${title}</title>
</head>
<body>
	<h1>List of All Users</h1>
	<ul>
		<c:forEach var="u" items="${users}">
			<li>${u.id}- ${u.pseudo} - ${u.mail}</li>
		</c:forEach>
	</ul>
</body>
</html>