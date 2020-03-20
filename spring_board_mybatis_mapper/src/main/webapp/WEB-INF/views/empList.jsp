<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		
		<script src = "http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			$(document).ready(function(){ 
			/* var result = document.getElementById('ajax'); */
				
					$.ajax({
						url: "http://localhost:8282/board/rest/emp",		
						type: "post",			
						cache: false,			
						dataType: "json",		
						/* data: "",				*/
						
						success: function(data){
							
					/* 			console.log(result.innerHTML = data.empno); */
					$.each(data, function(key,value){
						var tag = "";
						tag = tag + '<tr><td> ' + value.empno +  '</td>';
						tag = tag + '<td>' + value.ename + '</td><td>';
						tag = tag + '<a href="content_view?empno=' +value.empno + '">' + value.job + '</a></td>';
						tag = tag + '<td>'+value.hiredate+'</td>';
						tag = tag + '<td>'+ value.deptno+'</td></tr>';
						
						$("#ajax").append(tag);
					});
							

								
								
						},
						error: function(request, status, error){
							
							console.log(request.responseText);
							console.log(error);
					
						}
					});
			});	
		
		</script>
		
		
		<style>
			table {
					margin : auto;
				    width: 80%;
				    border: 1px solid #dddddd; /* 테이블 외곽선이 그려진다 */
				    border-collapse: collapse; /* 테두리 사이의 간격 제거 */
				  	text-align: center;
				  	
				}
				
				#first {
					background: #D1E3FF;
				}

		
		</style>
		
		
	
	
	</head>
	
	<body>
		
		<table width="800" cellpadding="0" cellspacing="0" border="1">
			<tr id = "first" >
				<td>empno</td>
				<td>ename</td>
				<td>job</td>
				<td>hiredate</td>
				<td>deptno</td>
			</tr>
			<tbody id = "ajax">
			</tbody>
			<!-- <tr>
				<td colspan="5"> <a href="write_view">글작성</a> </td>
			</tr> -->
		</table>
		
	</body>
</html>

