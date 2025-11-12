<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #6dd5fa, #2980b9);
        height: 100vh;
        margin: 0;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .login-container {
        background: #ffffff;
        padding: 40px 50px;
        border-radius: 12px;
        box-shadow: 0 4px 15px rgba(0,0,0,0.2);
        width: 350px;
        text-align: center;
    }

    h1 {
        margin-bottom: 25px;
        color: #2980b9;
        font-size: 26px;
        letter-spacing: 1px;
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px 12px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 15px;
        transition: border-color 0.3s;
    }

    input[type="text"]:focus,
    input[type="password"]:focus {
        border-color: #2980b9;
        outline: none;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #2980b9;
        border: none;
        color: white;
        font-size: 16px;
        font-weight: bold;
        border-radius: 6px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #1f6690;
    }

    .footer {
        margin-top: 15px;
        font-size: 13px;
        color: #666;
    }
</style>
</head>
<body>
    <div class="login-container">
        <h1>Admin Login</h1>
        <form action="adminLogin" method="post">
            <input type="text" name="emailId" placeholder="Enter your Email" required>
            <input type="password" name="password" placeholder="Enter your Password" required>
            <input type="submit" value="Login">
            <% 
String exception=(String) request.getAttribute("exeptionmsg");
if(exception!=null)
{
%>
<h3 style="color:red;"><%= exception%></h3>
<%} %>
        </form>
        <div class="footer">
            &copy; 2025 Movie Ticket Booking System
        </div>
    </div>
</body>
</html>
