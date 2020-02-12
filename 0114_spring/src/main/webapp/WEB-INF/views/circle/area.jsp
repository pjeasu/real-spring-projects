<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>area</title>
	</head>
	
	<body>
		<h3>
			area.jsp
		</h3>
		반지름 : ${circle.radius} <br>
		원의 넓이 : ${circle.area} <br><br>
		<!-- circle.area = getArea 호출!!! -->
		
</html>

