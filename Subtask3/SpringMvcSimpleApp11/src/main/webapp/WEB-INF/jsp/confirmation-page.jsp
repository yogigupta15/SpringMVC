<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
     <title>Summer Picnic Confirmation</title>
     <style>
         div,li {
             color: blue;
             padding: 6px;'
         }
     </style>
</head>
<body>
<div><b>Your registration is confirmed!. Please make sure your details are correct.</b></div>
<br/><br/>

<div>Name : ${registration.name}</div>
<div>Email : ${registration.email}</div>
<div>Number of guests : ${registration.numGuests}</div>
<div>Gender : ${registration.gender}</div>
<div>Department : ${registration.department}</div>

<div>Meals opted in: </div>

<ul>
<c:forEach var="meal" items="${registration.food}">
    <li>${meal}</li>
</c:forEach>    
</ul>

</body>
</html>