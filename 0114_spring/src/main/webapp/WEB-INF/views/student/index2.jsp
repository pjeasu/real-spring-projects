<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>index2</title>
	</head>
	
	<body>
		<h3>
			index2.jsp
		</h3>
	
		<% 
			String context = request.getContextPath();
		
		%>
		<!-- context는 경로때문에 넣어줘야한다 -->
		<form action = "<%= context %>/student/studentView" method = "post">
			이름 : <input type = "text" name = "name"> <br>
			나이 : <input type = "age" name = "age"> <br>
			학년 : <input type = "classNum" name = "classNum"> <br>
			반 : <input type = "gradeNum" name = "gradeNum"> <br>
			<input type = "submit" value = "전송 ">
		</form>
	
	</body>
</html>
