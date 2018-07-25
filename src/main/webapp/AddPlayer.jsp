<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Player Registration form</h1><br>
<form action="PlayerController" method="post">
   Name : <input type=text name="playername" ><br><rb>
     Type : <select   name="playertype" >
     <option name="batsman">batsman</option>
     <option name="bowler">bowler</option>
     <option name="allrounder">allrounder</option>
     </select><br><rb>
   Centuries: <input type=text name="noofcenturies" ><br><rb>
Half Centuries: <input type=text name="noofhalfcenturies" ><br><rb>
Catches Taken:<input type=text name="noofcatches" ><br><rb>
Contact Number:<input type=text name="contactnumber" ><br><rb>
<input type=reset name=s1 value="reset" >
<input type=submit name=s1 value="AddEmployee" ><br>
<br>
</form>
</body>
</html>