<%-- 
    Document   : index
    Created on : Jul 21, 2017, 9:39:07 AM
    Author     : ramaramtimilsina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}" ></c:set>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SM - Send Mail</title>
        <%@include file="links.jsp" %>
    </head>

    <body  class="fixed-nav sticky-footer bg-dark" id="page-top" >
        <div id="fb-root"></div>
        <script>(function (d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id))
                    return;
                js = d.createElement(s);
                js.id = id;
                js.src = 'https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.12';
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));</script>
        
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="index.html">Send Us A Mail</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
  </nav>
        <div class="container">
            <div class="card card-login mx-auto mt-5">
                <div class="card-header">Email Sender</div>
                <div class="card-body">
                    <form method="POST" action="${pageContext.request.contextPath}/SendMail">
                        <div class="form-group">
                            <label>To:</label>
                            <input name="to" type="text" placeholder="Enter email"/>
                        </div>    
                        <div class="form-group">
                            <label >Subject:</label>
                            <input name="sub" type="text" >
                        </div>

                        <div class="form-group">
                            <textarea name="msg" cols="80" rows="15"></textarea><br/>
                            <input type="submit" value="Send"/>
                        </div>
                    </form>
                        
                        
        <div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" 
             data-layout="standard" data-action="like" data-size="small" data-show-faces="true" 
             data-share="true"></div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
