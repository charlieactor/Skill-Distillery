<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>States</title>
<script
    src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
    <script>
var map;
function initialize() {
  var mapOptions = {
    zoom: 8,
    center: new google.maps.LatLng(${state.latitude}, ${state.longitude})};
  map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>
</head>
<body>
  <c:choose>
    <c:when test="${! empty state}">
      <ul>
        <li>${state.abbreviation}</li>
        <li>${state.name}</li>
        <li>${state.capital}</li>
        <li>${state.population}</li>
        <li>${state.fact}</li>
      </ul>
      <div id="map-canvas" style="height:300px; width:500px"></div>
    </c:when>
    <c:otherwise>
      <p>No state found</p>
    </c:otherwise>
  </c:choose>
</body>
</html>