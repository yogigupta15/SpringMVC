<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload File</title>
</head>
<body>
  <form method="POST" action="uploadMultipleFile" enctype="multipart/form-data">
  <p>Choose First File: <input type="file" name="file"></p>
  <p>First File Name : <input type="text" name="name"></p>
  
  <p>Choose Second File: <input type="file" name="file"></p>
  <p>Second File Name : <input type="text" name="name"></p>
  
  <p>Choose Third File: <input type="file" name="file"></p>
  <p>Third File Name : <input type="text" name="name"></p>
  
  <input type="submit" value="Upload">
  
  </form>
</body>
</html>   