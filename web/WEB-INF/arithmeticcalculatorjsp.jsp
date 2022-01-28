<%-- 
    Document   : arithmeticcalculatorjsp
    Created on : 27-Jan-2022, 4:46:13 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="">
            <br>
            <input type="submit" name="mathOperators" value="+">
            <input type="submit" name="mathOperators" value="-">
            <input type="submit" name="mathOperators" value="*">
            <input type="submit" name="mathOperators" value="%">
        </form>
        <br>
         Result: ${Message}
         <br>
         <a href="/Calculators/age">Age Calculator</a>
    </body>
</html>
