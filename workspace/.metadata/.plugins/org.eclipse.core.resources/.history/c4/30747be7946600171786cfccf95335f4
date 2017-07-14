<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presidents</title>
</head>
<body style="background-color:powderblue;">
<c:if test = "${initialload == 'true'}">
         Presidents by: <br>
Michael Maldonado<br>
Moses Lee<br>
Charlie Actor<br>
Andy Wynard<br>
<br>
      </c:if>



<img src="img/${pres.presidentNumber }.jpg" style="width:904px;height:828px;" />
<br>
<c:choose>
    <c:when test="${initialload=='true'}">
       <a href="Presidents.do?president1=${pres.presidentNumber }&submit=next">Let's View Your President</a><br/>
    </c:when>
    <c:otherwise>
      <a href="Presidents.do?president1=${pres.presidentNumber }&submit=next">Next</a><br/>
<a href="Presidents.do?president1=${pres.presidentNumber }&submit=prev">Previous</a><br/>
    </c:otherwise>

</c:choose>




 </body>
</html>