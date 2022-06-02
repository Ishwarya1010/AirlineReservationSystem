<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Booking Details</title>
</head>
<body>
	<table border=1 align="center">
		<tr>
			<th>Title</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Date Of Birth</th>
			<th>Address Line1</th>
			<th>Address Line2</th>
			<th>City</th>
			<th>Country</th>
			<th>State</th>
			<th>ZipCode</th>
			<th>Email</th>
			<th>Primary Phone</th>
			<th>Secondary Phone</th>
		</tr>
		<c:forEach items="${bookingdetails}" var="bookingdetail">
			<tr id="bookingdetail.getPassenger_id()">
				<td class="row-data">${bookingdetail.getTitle()}</td>
				<td class="row-data">${bookingdetail.getFirstName()}</td>
				<td class="row-data">${bookingdetail.getLastName()}</td>
				<td class="row-data">${bookingdetail.getGender()}</td>
				<td class="row-data">${bookingdetail.getDob()}</td>
				<td class="row-data">${bookingdetail.getAddressLine1()}</td>
				<td class="row-data">${bookingdetail.getAddressLine2()}</td>
				<td class="row-data">${bookingdetail.getCity()}</td>
				<td class="row-data">${bookingdetail.getCountry()}</td>
				<td class="row-data">${bookingdetail.getState()}</td>
				<td class="row-data">${bookingdetail.getZip()}</td>
				<td class="row-data">${bookingdetail.getEmail()}</td>
				<td class="row-data">${bookingdetail.getPrimaryPhone()}</td>
				<td class="row-data">${bookingdetail.getSecondaryPhone()}</td>
				<td><a
					href="/editPassenger?pid=${ bookingdetail.getPassenger_id()}">Edit</a>
			</tr>
		</c:forEach>
	<tr><td>
	<a  href="/deleteBooking">Delete Booking</a>
	</td>
	<td>
	<a  href="/findFlights">Home</a>
	</td>
	</tr>
	</table>
</body>
</html>
