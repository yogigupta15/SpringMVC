<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Fantabulous University  - Students</title>
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
             <th>Major</th>
         </tr>
         <c:forEach items="${allStudents}" var="stud">
         <tr>
            <td>${stud.firstName}</td>
            <td>${stud.lastName}</td>
            <td>${stud.major}</td>
         </tr>
        </c:forEach>
  </table>
</body>
</html>
