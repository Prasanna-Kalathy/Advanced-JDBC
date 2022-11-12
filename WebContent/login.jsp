<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="j_security_check" method="post">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td>PassWord:</td>
				<td><input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" value="Login"></td>
			</tr>
		</table>
	</form>

</body>
</html>