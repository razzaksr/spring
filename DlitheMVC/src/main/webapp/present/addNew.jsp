<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Employee Hiring</title>
</head>
<body>
<h2>Dlithe Employee</h2>
<form action="added" method="post">
<input type=text name=name><br>
<input type=text name=role><br>
<input type=number name=exp><br>
<input type=number name=lpa><br>
<select name=skill>
<option>Spring</option><option>Django</option><option>PHP</option>
<option>ASP</option><option>Python</option>
</select><br>
<input type=submit value="Hire">
</form>
</body>
</html>