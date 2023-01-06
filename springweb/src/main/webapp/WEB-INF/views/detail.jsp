<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel =" stylesheet" href="./css/style.css">
</head>
<body>	
	<div align='center' class='body'>
		<h2>상세보기</h2>
		<table>
			<tr>
				<td><img src="img/${item.pictureurl}"></td>
				<td align="center">
				<table>
				<tr height = "50">
				<td = width ="80">상품</td>
				<td = width ="160">${intem.itemid}</td>
				</tr>
				<table>
				<tr height = "50">
				<td = width ="80">가격</td>
				<td = width ="160">${intem.price}</td>
				</tr>
				<table>
				<tr height = "50">
				<td = width ="80">비고</td>
				<td = width ="160">${item.description}</td>
				</tr>
				<tr>
					<td colspan ="2" align ="center" width ="240">
					<a href ="../">목록으로</a></td>
				</tr>				
		</table>
		
	</div>
	<!-- 괄호로 써주는것을 el이라고 함. -->
</body>
</html>