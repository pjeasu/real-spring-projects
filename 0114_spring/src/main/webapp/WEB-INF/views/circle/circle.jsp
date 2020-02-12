<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>write</title>
	</head>
	
	<body>
		<h4>
			circle.jsp
		</h4>
	
		<form action = "${pageContext.request.contextPath}/circle/area" method = "post">
			<h2>원의 넓이 <br></h2>
			반지름 : <input type = "text" name = "radius"> <br><br>
			<!-- name값과 커맨드객체(Circle클래스)의 변수명을 꼭 맞추기 -->
			
			<!-- <h2>사각형의 넓이  <br></h2>
			너비 : <input type = "text" name = "width"> <br>
			높이 : <input type = "text" name = "height"> <br><br>-->
			<input type = "submit" value = "전송 "> 
		</form>
		
	</body>
</html>
