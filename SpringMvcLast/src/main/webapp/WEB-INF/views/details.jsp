<%@ page import ="java.util.*" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Submitted Details</title>
</head>
<body>
<h1 class="text-muted">${same1}</h1>

<h1 class="text-center">Your entered Name is: ${user.uName}</h1>
<h1 class="text-center">Your entered email is: ${user.emailD}</h1>
<h1 class="text-center">Your entered password is: ${user.passwordD}</h1>


</body>
</html>