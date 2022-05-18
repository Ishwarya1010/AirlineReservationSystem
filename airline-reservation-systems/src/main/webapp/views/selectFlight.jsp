<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select a flight</title>
</head>
<body>
	<script>
		function store() {

			var rowId = event.target.parentNode.parentNode.id;
			var data = document.getElementById(rowId).querySelectorAll(
					".row-data");
			var flightData = {
				carrierCode : data[0].innerHTML,
				no_of_stops : parseInt(data[1].innerHTML),
				duration : data[2].innerHTML,
				grandTotal : parseInt(data[3].innerHTML)
			};

			var jsonString = JSON.stringify(flightData);

			var xhttp = new XMLHttpRequest();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					alert(this.responseText);
					callback();
				}
			};
			xhttp.open("POST", "/addBookingFlight", true);
			xhttp.setRequestHeader("Content-type", "application/json");
			xhttp.send(jsonString);
			function callback() {
				window.location = "/passengerDetails"
			}
		}
	</script>
	<table border=1>
		<tr>
			<th>Carrier Code</th>
			<th>Number Of Stops</th>
			<th>Duration</th>
			<th>Price</th>
		</tr>

		<c:forEach items="${flights.getData()}" var="flight">
			<c:forEach items="${flight.getItineraries()}" var="itineraries">
				<c:forEach items="${itineraries.getSegments()}" var="segment"
					varStatus="status">
					<tr id="${flight.id}+${segment.id}">
						<td class="row-data">
							${segment.getOperating().getCarrierCode()}</td>
						<td class="row-data">${segment.getNumberOfStops()}</td>
						<td class="row-data">${segment.getDuration()}</td>
						<td class="row-data">${flight.getPrice().getGrandTotal()}</td>
						<td>
							<button type="submit" onclick="store()">select</button>
						</td>
				</c:forEach>
			</c:forEach>
		</c:forEach>
	</table>
</body>
</html>