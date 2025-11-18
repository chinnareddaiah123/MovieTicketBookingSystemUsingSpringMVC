<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Options</title>

<style>

    body {
        background: #f4f4f4;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    .container {
        margin: 120px auto;
        width: 350px;
        text-align: center;
        padding: 30px;
        background: white;
        border-radius: 12px;
        box-shadow: 0px 0px 12px rgba(0,0,0,0.2);
    }

    h2 {
        color: #333;
        margin-bottom: 25px;
    }

    .btn {
        width: 90%;
        padding: 12px;
        margin: 12px 0;
        font-size: 16px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        background: #007bff;
        color: white;
        transition: 0.3s;
    }

    .btn:hover {
        background: #0056b3;
    }

    .btn-secondary {
        background: #28a745;
    }

    .btn-secondary:hover {
        background: #1e7e34;
    }

</style>
</head>
<body>
<center><h1>Login Succesfull</h1></center>
<div class="container">
    <h2>Movie Operations</h2>

    <form action="addMovies">
        <input class="btn" type="submit" value="Add Movies">
    </form>

    <form action="showMovieDetails">
        <input class="btn btn-secondary" type="submit" value="Show Movie Details">
    </form>
</div>

</body>
</html>
