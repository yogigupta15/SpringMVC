<%@page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>File Upload Page</title>
</head>
<body>
<h3 style="color:blue">${filesuccess}</h3>
<form:form method="post" action="saveFile" enctype="multipart/form-data">
<p><label for="image">Choose File to Upload</label></p>
<p><input name="file" id ="fileToUpload" type="file" /></p>
<p><input type="submit" value="Upload" /></p>
</form:form>
</body>
</html>