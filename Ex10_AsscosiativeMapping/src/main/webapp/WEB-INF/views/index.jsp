<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="minsert" mehtod="post">
		ID : <input name="id"><br><br>
		NAME : <input name="name"><br><br>
		PASSWORD : <input type="password" name="password"><br><br>
		<button>회원가입</button>
	</form>
	<br>
	<hr>
	<br>
	<form action="binsert" method="post">
		제목 : <input name="title"><br><br>
		내용 : <input name="content"><br><br>
		<button>게시글 작성</button>
	</form>
	<br>
	<hr>
	<br>
	<a href="mupdate?id=user01&name=김수정">멤버 이름 수정</a>
</body>
</html>