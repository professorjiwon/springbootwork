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
	<c:if test="${param.error != null}">
		Login Error!!!<br>
		${error_msg}<br><br>
	</c:if>
	<form action="login_check" method="post">
		ID : <input name="username"><br>
		PW : <input name="pwd"><br>
		<input type="submit" value="LOGIN">
	</form>
</body>
</html>