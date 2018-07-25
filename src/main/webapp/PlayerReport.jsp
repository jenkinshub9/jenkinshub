<%@page import="com.org.model.PlayerVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("param").equals("all")){  %>
<h1> List Of Player Details</h1> <br>
<% List<PlayerVO> playerLsit= (List<PlayerVO>)request.getAttribute("playerList"); %>
 
<% for (PlayerVO  player : playerLsit)
{
   
     out.println(player.getPlayerName()+":"+player.getNoOfCenturies()+":"+player.getNoOfHalfCenturies()+"<br>");
   
}
   
    %>
<%} else{ %>
  <h1> Players Eligible For the Best batsman Awards</h1> <br>
<% List<PlayerVO> playerLsit= (List<PlayerVO>)request.getAttribute("playerList"); %>
 
<% for (PlayerVO  player : playerLsit)
{
   
     out.println(player.getPlayerName()+":"+player.getNoOfCenturies()+":"+player.getNoOfHalfCenturies()+"<br>");
   
}
   
    %>
    <%} %>
</body>
</html>