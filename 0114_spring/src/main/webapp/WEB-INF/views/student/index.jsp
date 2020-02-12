<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>index</title>
	</head>
	
	<body>
		<h3>
			index.jsp
		</h3>
	
		<form action = "student" method = "post">
			student id : <input type = "text" name = "id"> <br>
			<input type = "submit" value = "전송 ">
		</form>
	
	</body>
</html>

