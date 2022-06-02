<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Booking</title>
</head>
<body>
	<div align="center">
		<form action="/viewBooking">
			<table style="with: 80%" align="center">
				<tr>
					<td>Booking Id</td>
					<td><input type="text" name="booking_id" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>