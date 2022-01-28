<%-- 
    Document   : agecalculator
    Created on : 27-Jan-2022, 4:24:17 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your Age:</label>
            <input type="text" name="age" value="">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        ${Message}
        <br>
        <a href="/Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
