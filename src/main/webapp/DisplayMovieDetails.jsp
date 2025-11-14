<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dispaly Movie Details</title>
</head>
<body>
<center>
    <%-- Displaying the raw list object for debugging (EL Syntax) --%>
    <p>${detailsList }</p>
    <p>this is paragraph</p>
    
    <table border="1">
        <tr>
            <th>Movie Id</th>
            <th>Movie Name</th>
            <th>Movie theatre Name</th>
            <th>Movie Cost</th>
            <th>Available Seats</th>
            <th>Screen no</th>
            <th>Show Timings</th>
        </tr>
        
        <%-- JSTL tag for iteration: loops over the 'DetailsList' (or 'detailsList') collection --%>
        <%-- NOTE: I assumed 'DetailsList' in the 'th:each' was the intended list name. --%>
        <c:forEach items="${DetailsList}" var="movie">
        <tr>
            <%-- Expression Language (EL) to access properties --%>
            <td>${movie.movieId}</td>
            <td>${movie.movieName}</td>
            
            <%-- Assuming 'theaterName' is a separate attribute, but the column is missing in the list below --%>
            <%-- If you want the theater name, use: <td>${theaterName}</td> --%>
            
            <td>${movie.TicketPrice}</td>
            <td>${movie.availableSeats}</td>
            <td>${movie.screenNo}</td>
            <td>${movie.showTimeings}</td>
        </tr>
        </c:forEach>
    </table>
</center>
	
</body>
</html>