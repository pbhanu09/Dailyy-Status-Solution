<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Post invoke</title>
</head>
<body>
<h2>Employee Details</h2>
<form method="post" action="registerEmployee">
    Enter Employee Name : <input type="text" name="Name"/>
    <p></p>
    Enter PLID: 		  <input type="text" name="PLID">
    <p></p>
    Enter Test case Name: <input type="text" name="TestCaseName">
    <p></p>
    Enter Test case ID:   <input type="text" name="TestcaseID">
    <p></p>
    Enter Comments: <input type="text" name="Comments">
    <p></p>
    <input type="submit" value="Submit">
</form>
</body>
</html>