<%-- 
    Document   : contact
    Created on : Mar 29, 2018, 4:43:23 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact us</title>
    </head>
    <body>
        <h1>Contact us or visit us</h1>
        <section>
            <form action="feedback" method="POST" >
                <label>User</label>
                <input name="uname" type="text" placeholder="username" >
                <br>
                <label>Remarks:</label>
                <textarea name="uremarks" cols="80" rows="16" placeholder="Comments, queries, feedback"></textarea>
                <br>
                <input type="submit" value="Send Feedback" >
            </form>
        </section>
    </body>
</html>
