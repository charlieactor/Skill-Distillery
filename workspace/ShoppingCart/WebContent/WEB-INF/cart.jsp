<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shopping Cart</title>
</head>
<body>
 <form action="addItem.do" method="POST">
  <select name="productId">
   <c:forEach var="product" items="${inventory}">
   	<option value="${product.productID}">${product.name}</option>
   </c:forEach>

  </select>
  <input type="submit" value="add Item to cart">
  <input type="submit" name="clear" value="Clear Cart">
 </form>
 <c:if test="${product != null}">
 You chose product ${product.name}
 </c:if>
 
 <hr>
 
 <c:if test="${not empty cart}">
  Your Cart: <br>
 <ul>
  <c:forEach var="item" items="${cart}">
   <li>${item.name} ( <fmt:formatNumber value="${item.price}" type="Currency"></fmt:formatNumber>)</li>
  </c:forEach>
 </ul>
 </c:if>
</body>
</html>