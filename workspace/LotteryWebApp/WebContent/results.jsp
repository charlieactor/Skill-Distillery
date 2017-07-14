<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Winning Lottery Numbers</title>
</head>
<body>
	<h3>Winning Lottery Numbers:</h3>
	<c:forEach var="ball" items="${balls}">
	<br>${ball.num}<br>
	</c:forEach>
</body>
</html>