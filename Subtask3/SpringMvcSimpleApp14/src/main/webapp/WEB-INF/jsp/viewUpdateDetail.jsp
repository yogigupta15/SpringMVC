<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
   <title>Upload Successful</title>
</head>
<body>
     <div id="global">
          <h3>Following files are uploaded successfully</h3>
          
          <ol>
              <c:forEach items="${upload.images}" var="image">
                 <li>${image.originalFilename}</li>
              </c:forEach>
          </ol>
     </div>
</body>
</html>