<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	
	
	</head>
	
	<body>
		
		<table width="800" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>제목</td>
				<td>날짜</td>
				<td>히트</td>
			</tr>
			<c:forEach items="${emp}" var="dto">
			<tr>
				<td id = "ajax1"></td>
				<td id = "ajax2"></td>
				<td>
					<%-- <c:forEach begin="1" end="${dto.bIndent}">-</c:forEach> --%>
					<a href="content_view?bId=${emp.empno}">${emp.job}</a></td>
				<td>${emp.hiredate}</td>
				<td>${emp.comm}</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="5"> <a href="write_view">글작성</a> </td>
			</tr>
		</table>
		
	</body>
</html>

