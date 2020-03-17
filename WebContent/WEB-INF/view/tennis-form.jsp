 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Details</title>
</head>
<body>
 <form:form action="tennis-result" modelAttribute="tennis">
	Player Name : <form:input placeholder="Enter name" path="playerName" />
	<br><br>
	 Country Name : <form:input placeholder="Enter Country" path="country" />
	 <br><br>
	 Favorite Surface :
	 <br>
	 Clay <form:radiobutton path="favoriteSurface" value="clay" />
	 Grass <form:radiobutton path="favoriteSurface" value="grass" />
	 Hard-Court <form:radiobutton path="favoriteSurface" value="hardcourt" />
	<br><br>
	<input type="submit" value="Submit" />	 
</form:form> 
</body>
</html>