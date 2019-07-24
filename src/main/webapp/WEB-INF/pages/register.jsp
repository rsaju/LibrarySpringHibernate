<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<form:form action="registeraction" method="post" modelAttribute="userreg">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>PHONE</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>SCHOOL</td>
				<td><input type="text" name="school" /></td>
			</tr>
			<tr>
				<td>USERNAME</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input type="submit" value=register"/>
	</form:form>
	</div>
</body>
</html>