<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Passenger Details</title>
</head>

<body>

	<div>
		<h1>Add Passenger Details</h1>
		<form method="post" action="/addPassengers">
			<table style="with: 80%">
				<tr>
					<td>Title</td>
					<td><select name="title" id="title">
							<option value="Mr">Mr</option>
							<option value="Mrs">Mrs</option>
							<option value="Miss">Miss</option>
					</select></td>
				</tr>
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="firstName" required="required" /></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><select name="gender" id="gender">
							<option value="Male">Male</option>
							<option value="Female">Female</option>
					</select></td>
				</tr>
				<tr>
					<td>Date Of Birth</td>
					<td><input type="date" name="dob" required="required" /></td>
				</tr>
				<tr>
					<td>Address Line1</td>
					<td><input type="text" name="addressLine1" required="required" /></td>
				</tr>
				<tr>
					<td>Address Line2</td>
					<td><input type="text" name="addressLine2" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" required="required" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="country" required="required" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" required="required" /></td>
				</tr>
				<tr>
					<td>Zip</td>
					<td><input type="text" name="zip" required="required" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" required="required" /></td>
				</tr>
				<tr>
					<td>Confirm Email</td>
					<td><input type="text" name="confirmedEmail"
						required="required" /></td>
				</tr>
				<tr>
					<td>Primary Phone</td>
					<td><input type="text" name="primaryPhone" required="required" /></td>
				</tr>
				<tr>
					<td>Secondary Phone</td>
					<td><input type="text" name="secondaryPhone" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>