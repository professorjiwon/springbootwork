<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JPA Paging - Name Like Paging</h1>
	
	총게시글의 갯수 : ${totalElements}<br>
	총 페이지 수 : ${totalPages}<br>
	한페이지당 항목 수 : ${size}<br>
	현재 페이지 : ${nowPage}<br>
	현재 페이지의 항목 수 : ${numberOfElements}<br><br>
	
	<hr>
	
	<c:forEach items="${members}" var="m">
		아이디 : ${m.id}<br>
		이름 : ${m.name}<br>
		이메일 : ${m.email}<br><br>
		<hr>
	</c:forEach>
	
	
</body>
</html>