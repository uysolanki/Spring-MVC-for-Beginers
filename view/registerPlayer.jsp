<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  action="hello" modelAttribute="emptyPlayerObject">
Enter Jersey Number : <form:input path="jno" /> <br>
Enter Player Name :  <form:input path="pname" /> <br>
Enter Matches Played:  <form:input path="mp" /> <br>
Enter Runs Scored :  <form:input path="rs" /> <br>
<input type="submit" name="s1" value="REGISTER PLAYER">
</form:form>
</body>
</html>