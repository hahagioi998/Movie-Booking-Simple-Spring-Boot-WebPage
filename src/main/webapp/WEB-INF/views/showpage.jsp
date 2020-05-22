<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Movie Ticket Booking </center></h1>
<form:form action="/calculateCost" method="POST" modelAttribute="ticket">
 <table>
         <tr>
            <td>Movie Name</td>
            <td><form:input id="movieName" path="movieName"  required="required"/></td>
         </tr>
         <tr>
            <td>Choose Circle</td>
            <td><form:select id="circleType" name="circleType" path="circleType" items="${circleList}"/></td>
            
         </tr>
         <tr>
            <td>Number ofTickets</td>
            <td><form:input id="noOfTickets" name="noOfTickets" path="noOfTickets"  required="required"/></td>
         </tr>
         <tr>
            <td></td>
            <td><input type="submit" name ="submit" value="CalculateCost" /></td>
         </tr>
      </table>
              	
</form:form>

</body>
</html>	 	  	    	    	     	      	 	
