<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Contacts</title>
</head>
<body>


<pre>
<form action="editContacts" method="post">
<div>
Id: <input type="text" name="id" value="${contacts.id}" readonly/></div>
First Name: <input type="text" name="firstName" value="${contacts.firstName}"/>
Last Name: <input type="text" name="lastName" value="${contacts.lastName}"/>
Email: <input type="text" name="email" value="${contacts.email}"/>
<input type="submit" value="save"/>

</form>
</pre>

</body>
</html>