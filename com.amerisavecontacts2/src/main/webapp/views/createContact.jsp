<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Contact</title>
</head>
<body>


<pre>
<form action="saveContact" method="post"><div>
Id: <input type="text" name="id"/></div>
First Name: <input type="text" name="firstName"/>
Last Name: <input type="text" name="lastName"/>
Email: <input type="text" name="email"/>


<input type="submit" value="save"/>
</pre>
</form>
${message}

<a href="displayContacts"> View All Contacts</a>


</body>
</html>