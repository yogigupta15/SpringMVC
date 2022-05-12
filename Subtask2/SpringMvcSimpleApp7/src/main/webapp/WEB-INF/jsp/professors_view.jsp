<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Fantabulous University  - Professors</title>
    <style>
       table,th,td {
       border: 2px solid green;
       border-collapse: collapse;
       padding: 8px;
       color: red;}
    </style>
</head>
<body>
    <h2>Students of Fantabulous University</h2>
   <table>
         <tr>
             <th>First Name</th>
             <th>Last Name</th>
             <th>Department</th>
         </tr>
         <c:forEach items="${professors}" var="professor">
         <tr>
            <td>${professor.firstName}</td>
            <td>${professor.lastName}</td>
            <td>${professor.department}</td>
         </tr>
        </c:forEach>
  </table>
</body>
</html>
