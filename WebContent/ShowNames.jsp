<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom Tags</title>
<%@ taglib uri="http://training.com/examples/greet" prefix="mytag"%>
</head>
<body>
	<mytag:ForEach items="names"></mytag:ForEach>

</body>
</html>