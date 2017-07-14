<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presidents</title>
<!-- Bootstrap -->
<style type="text/css">
<%@includefile="bootstrap.min.css"%>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="bootstrap.min.js"></script>
</head>
<body style="background-color: #bbb;">


<form action="Presidents.do" method="GET">
		<input type="number" min="1" max="45" name="PrezByTerm" placeholder="Enter Term Number of President" style="width: 300px"> <br>
	<input type="submit" value="Submit">	

</form>



<div class="row">
	<div class="container-flex">
		<h2 align="center">Welcome to the Presidents information site</h2>
		<h6 align="center">Please have a look around, and learn something new</h6>
	</div>
	</div>

<div class="jumbotron">

	<div id="my-slider" class="carousel slide">
	
		<div class="row">
			<div class="col-xs-3">
				<h3 align="right">Little known fact: </h3><h5 align="right">${pres.interestingFact}</h5>
			</div>
			<div class="col-xs-4">
			<div class="container-flex"></div>
			
			

				<!-- wrapper for slides -->

				<div class="carousel-inner">
					<div class="item active">
						<img src="img/${pres.presidentNumber}.jpg" style="width: 100%" />
						<div class="carousel-caption">
							<h2>${pres.firstName} ${pres.middleName} ${pres.lastName}</h2>
							
							<h4>I was the #${pres.presidentNumber} gangsta</h4>
							
						</div>
					</div>
				</div>

				<!-- controls or next/prev buttons -->
				<a class="left carousel-control"
					href="Presidents.do?president1=${pres.presidentNumber}&submit=prev"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="right carousel-control"
					href="Presidents.do?president1=${pres.presidentNumber}&submit=next"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>

			</div>
			<div class="col-xs-5">
			<div class="well">
				<p align="justify">${pres.synopsis}</p>
				</div>
			</div>
		</div>
		</div>
		</div>
</body>
</html>








