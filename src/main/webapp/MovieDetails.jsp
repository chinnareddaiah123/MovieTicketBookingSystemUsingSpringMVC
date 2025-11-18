<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Details</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f2f2f2;
        margin: 0;
        padding: 0;
    }

    h1 {
        margin-top: 40px;
        color: #333;
    }

    .container {
        margin: 50px auto;
        width: 400px;
        padding: 25px;
        background: white;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.2);
        text-align: center;
    }

    .inputBox {
        width: 90%;
        padding: 10px;
        margin: 10px 0;
        border-radius: 5px;
        border: 1px solid #ccc;
    }

    .btn {
        width: 95%;
        padding: 12px;
        margin-top: 15px;
        border: none;
        border-radius: 5px;
        background-color: #007bff;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }

    .btn:hover {
        background-color: #0056b3;
    }

    .backBtn {
        background-color: #28a745;
    }

    .backBtn:hover {
        background-color: #1e7e34;
    }
</style>

</head>
<body>

<center>
<<<<<<< HEAD
<h1>Movie Details</h1>

<div class="container">

    <form action="addMovieDetails">
        <input class="inputBox" placeholder="Enter the movie name" name="movieName">
         <input class="inputBox" placeholder="Enter the TheaterNAme" name="theaterName">
        <input class="inputBox" placeholder="Enter the Screen number" name="screenNo">
        <input class="inputBox" placeholder="Enter the Ticket Price" name="TicketPrice">
        <input class="inputBox" placeholder="Enter the Available Seats" name="availableSeats">
        <input class="inputBox" placeholder="Enter the Show Timings" name="showTimings">

        <input class="btn" type="submit" value="Submit">
    </form>

    <form action="showOptions">
        <input class="btn backBtn" type="submit" value="Back To Options">
    </form>

</div>

=======
<h1>Enter Movie Details</h1>
<form action="movieDetails">
<input placeholder="Enter Screeen Number" name="screenNo">
<br>
<input placeholder="Enter Movie Name" name="movieName">
<br>
<input placeholder="Enter available Seats" name="availableSeats">
<br>
<input placeholder="Enter Show Timings" name="showTimeings">
<br>
<input placeholder="Enter Ticket Price" name="TicketPrice">
<br>
<input type="submit" >
</form>
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544
</center>

</body>
</html>
