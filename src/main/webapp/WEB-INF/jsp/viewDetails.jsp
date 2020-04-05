<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Daily Status Ack</title>
</head>
<body>
<h1>Daily Status submit form</h1>
<h2> Details has submitted successfully !!!</h2>
<h4> Employee Name : ${employee.getName()} </h4>
<h4> Employee PLID : ${employee.getPLID()} </h4>
<h4> Test case Name : ${employee.getTestCaseName()} </h4>
<h4> Test case ID: ${employee.getTestcaseID()} </h4>
<h4> Comments: ${employee.getComments()} </h4>
</body>
</html>