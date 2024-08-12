<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JPA PAGING</title>
</head>
<body>
	<h1>JPQL_nativeQuery</h1>
	
	<a href="selectByNameLike1?name=user">Name Like 조회 : JPQL 1</a><br><br>
	<a href="selectByNameLike2?name=user">Name Like 조회 : JPQL 2</a><br><br>
	<a href="selectByNameLike3?name=user&page=2">Name Like 조회 : JPQL 3 - 2페이지</a><br><br>
	<a href="selectByNameLike4?name=user">Name Like 조회 : Native Query</a>
</body>
</html>