<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<!-- link는 파일의 위치기준이 아니고 URL기준이다. -->
	<link rel =" stylesheet" href="./css/style.css">
	<div align="center" class="body">
		<h2>상품목록</h2>
		<table border="1">
			<tr class="header">
				<th align="center" width="80">상품아이디</th>
				<th align="center" width="320">상품이름</th>
				<th align="center" width="100">상품가격</th>
			</tr>
			<c:forEach var="item" items="${list}">
				<tr class="record">
					<td align="center" width="80">${item.itemid}</td>
					<td align="left" width="320">${item.itemname}</td>
					<td align="right" width="100">${item.price}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
	${list}
	<!-- 
	<a href="hello">안녕안녕</a>
	<a href="message/detail/11">URL에 포함된 매개변수</a>
	<a href="redirect">리다이렉트</a>
	 -->
	<!-- action은 생략하면현재 요청
		method는 기본이 get
		enctype은 file이 있는 경우 multipart/form-data로 설정 그외는 생략
		id는스크트에서 사용하기 위해서 사용
		get방식은 한글 인코딩 해야함
		post방식은파일이 있고 파일이 없고 두가지 경우를 post방식으로 구	 -->
	<!-- 
	<form action="param1" method="">
		이름:<input type="text" name="name" /><br /> 비밀번호:<input type="password"
			name="password" /><br /> <input type="submit" value="전송" />

	</form>
	<form action="param2" method="post">
		이름:<input type="text" name="name" /><br /> 비밀번호:<input type="password"
			name="password" /><br /> <input type="submit" value="전송" />
	</form>
	<form action="param3" method="post">
		이름:<input type="text" name="name" /><br /> 비밀번호:<input type="password"
			name="password" /><br /> <input type="submit" value="전송" />
	</form>
	-->
</body>
</html>