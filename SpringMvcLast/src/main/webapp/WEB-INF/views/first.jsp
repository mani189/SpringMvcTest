<%@ page import ="java.util.*" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>First</title>
</head>
<body>
<h1>First Page</h1>
<h2>Welcome here</h2>

<h1>Owner name is ${name}</h1>
<h1>My Employee Id is ${id}</h1>
<h3>Here are the following lists of Assets I have : </h3>
<c:forEach var = "i" items="${list}">
         Item :<h3> <c:out value = "${i}"/></h3>
      </c:forEach>
<h3>${date}</h3>

</body>
</html>