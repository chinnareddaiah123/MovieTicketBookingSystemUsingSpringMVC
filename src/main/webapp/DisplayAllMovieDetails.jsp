<%@page import="com.movie.entity.MovieDetails"%>
<%@page import="com.movie.dto.MovieDetailsdto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.movie.entity.MovieDetails" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Details</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f2f2f2;
        padding: 20px;
    }

    h2 {
        color: #333;
        margin-bottom: 20px;
    }

    table {
        border-collapse: collapse;
        width: 90%;
        background: white;
        box-shadow: 0px 0px 10px #ccc;
    }

    th, td {
        padding: 12px;
        text-align: center;
        border: 1px solid #ddd;
    }

    th {
        background-color: #4CAF50;
        color: white;
        font-size: 16px;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #e4f5e9;
    }
</style>

</head>
<body>
<center>

<h2>All Movie Details</h2>

<table>
    <tr>
        <th>Movie Id</th>
        <th>Theater Name</th>
        <th>Movie Name</th>
        <th>Screen No</th>
        <th>Ticket Price</th>
        <th>Available Seats</th>
        <th>Show Timings</th>
    </tr>

<%
List<MovieDetails> movies=(List<MovieDetails>)request.getAttribute("movies");
for(MovieDetails m : movies){
%>
<tr>
    <td><%= m.getMovieId() %></td>
    <td><%= m.getTheaterName() %></td>
    <td><%= m.getMovieName() %></td>
    <td><%= m.getScreenNo() %></td>
    <td><%= m.getTicketPrice() %></td>
    <td><%= m.getAvailableSeats() %></td>
    <td><%= m.getShowTimings() %></td>
</tr>
<%
}
%>

</table>

</center>
</body>
</html>
