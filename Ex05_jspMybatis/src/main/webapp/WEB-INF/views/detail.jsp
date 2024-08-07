<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {width:800px; margin:0 auto;}
</style>
</head>
<body>
	<h2>상세보기</h2>
	작성자 : ${detailBoard.writer}<br><br>
	제목 : ${detailBoard.title}<br><br>
	내용 : ${detailBoard.content}<br><br>
	
	<a href=""><button type="button">목록</button></a>
</body>
</html>