<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 등록 성공</h1>
	제목 : ${board.title}<br><br>
	내용 : ${board.content}<br><br>
	작성자 : ${board.member}<br><br>
	작성자 : ${board.member.getId()}
</body>
</html>