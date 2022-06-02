<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Flights</title>
</head>
<body>
	<form action="/getFlights">
		<div  style="width:75%;" align="right">
			<input type="button" onclick="location.href='/selectBooking'"
				value="Booking Details" />
		</div>
		<h1 align="center">Find Flights</h1>
		<table align="center">
			<tr>
				<td><input type="text" name="originLocationCode"
					placeholder="Source" /></td>
				<td><input type="text" name="destinationLocationCode"
					placeholder="Destination" /></td>
			</tr>
			<tr>
				<td><select name="oneWay">
						<option value="true">Round Trip</option>
						<option value="false">One Way</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="date" name="departureDate"
					placeholder="Source" /></td>
				<td><input type="date" name="returnDate" /></td>
			</tr>
			<tr>
				<td>No of Passengers</td>
				<td><select name="no_of_persons">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
				</select></td>
			</tr>
			<tr>
				<td>Class of Journey</td>
				<td><select name="travelClass">
						<option value="economy">Economy</option>
						<option value="premium_economy">Premium Economy</option>
						<option value="business">Business</option>
						<option value="first">First</option>

				</select></td>
			<tr>

				<td align="center"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>