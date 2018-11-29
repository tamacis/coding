<%-- 
    Document   : login
    Created on : May 23, 2018, 3:55:20 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Admin Login</h1>
        <form action="${pageContext.request.contextPath}/login" method="POST" >
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
            <p>
                <label>Username:</label>
                <input type="text" name="username" placeholder="Enter username" >
            </p>
            <p>
                <label>Password:</label>
                <input type="password" name="password" placeholder="Enter password" >
            </p>
            <p>
                <input type="submit" value="Login" >
            </p>
        </form>
    </body>
</html>
