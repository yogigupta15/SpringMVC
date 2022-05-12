<%@page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Summer Picnic Registration</title>
</head>
<h2>Fantabulous picnic registration form</h2>
<body>
   <form:form action="submission" modelAttribute="registration">
       
       <b>Name:</b> <form:input path="name" /> <form:errors path="name" cssClass="error"></form:errors>
       <br/><br/>
       
       <b>Email:</b> <form:input path="email" /> <form:errors path="email" cssClass="error"></form:errors>
       <br/><br/>
       
       <b>Number of guests:</b> <form:input path="numGuests" /> <form:errors path="numGuests" cssClass="error"></form:errors>
       <br/><br/>
       
       <b>Gender:</b><br/>
       
       Male<form:radiobutton path="gender" value="Male" /> <br/>
       Female<form:radiobutton path="gender" value="Female" /> <br/>
       
       <br/><br/>
       
<!--       <b>Department:</b>
       <form:select path="department">
            <form:option value="Biology" label="Biology" />
            <form:option value="Mathametics" label="Mathametics" />
            <form:option value="Chemistry" label="Chemistry" />  
            <form:option value="Arts" label="Arts" />
       </form:select> 
       <br/><br/>  --> 
       
       <b>Department:</b>
       <form:select path="department" items="${departmentList}"></form:select>
       <br/><br/>
       
       <b>Meals:</b> <br/>
       <form:checkbox path="food" value="BreakFast"/> BreakFast <br/>
       <form:checkbox path="food" value="Lunch"/> Lunch <br/>
       <form:checkbox path="food" value="Dinner"/> Dinner <br/>
       <br/><br/>
       <input type="submit" value="Submit" />  
   </form:form>
</body>
</html>