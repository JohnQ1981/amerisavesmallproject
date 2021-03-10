<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Contacts</title>
</head>
<body>

<div><h2>Contacts</h2></div>
<table>
<tr>
<th>Id:</th>
<th>firstName:</th>
<th>lastName:</th>
<th>email:</th>
<c:forEach var="contact" items="${contacts}">
<tr>
<td> ${contact.id}   </td>
<td> ${contact.firstName}  </td>
<td> ${contact.lastName}  </td>
<td> ${contact.email}  </td>
<td><a href="deleteContact?id=${contact.id}">Delete Contact</a></td>
<td><a href="showUpdate?id=${contact.id}">Edit/Update Contact</a></td>
</c:forEach>

</tr>
</table>


</body>
</html>