<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" ></script>
</head>
<body>
	<h2>글 작 성</h2>

	<form action="write" method="post">
		작성자 : <input name="writer"><br><br>
		제목 : <input name="title"><br><br>
		내용 : <textarea cols="50" rows="5" name="content"></textarea><br><br>
		<button>글쓰기</button>&emsp;
		<a href="list"><button type="button">목록</button></a>
	</form>

</body>
</html>