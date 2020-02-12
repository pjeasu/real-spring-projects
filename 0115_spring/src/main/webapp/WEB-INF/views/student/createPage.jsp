<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>createPage</title>
	</head>
	
	<body>
		<h4>
			createPage.jsp
		</h4>
		
		<form action = "student/create">
			이름 : <input type = "text" name = "name" value = "${student.name}" > <br>
			아이디 : <input type = "text" name = "id" value = "${student.id}" > <br>
			<input type = "submit" value = "전송"> <br>
		</form>
		
	</body>
</html>
 