<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>studentView</title>
	</head>
	
	<body>
		<h3>
			studentView.jsp
		</h3>
	
			이름 : ${studentInfo.name} <br>
			나이 : ${studentInfo.age} <br>
			학년 : ${studentInfo.classNum} <br>
			반 : ${studentInfo.gradeNum} <br>
	
	</body>
</html>
