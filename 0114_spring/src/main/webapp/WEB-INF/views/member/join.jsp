<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>join</title>
	</head>
	
	<body>
		<h1>
			join.jsp 파일입니다
		</h1>
		<p>
			아이디 : ${member.id} <br> 
			비밀번호 : ${member.pw} <br>
		</p>
		
	</body>
</html>
