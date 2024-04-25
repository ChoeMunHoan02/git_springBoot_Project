<%@ page  contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
<h2>git2 연습</h2>
<c:forEach var="name" items="${nameArr}">
 <c:out value="${name}" /><hr>
</c:forEach>
</body>
</html>