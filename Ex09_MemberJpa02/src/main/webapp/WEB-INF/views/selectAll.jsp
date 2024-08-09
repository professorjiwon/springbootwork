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
	<h1>Member JPA #02 - Select${title}</h1>
	<c:forEach items="${mList}" var="member">
		아이디 : ${member.id}<br>
		이름 : ${member.username}<br>
		날짜 : ${member.email}<hr>
	</c:forEach>
</body>
</html>