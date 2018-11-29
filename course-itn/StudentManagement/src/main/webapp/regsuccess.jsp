<%-- 
    Document   : regsuccess
    Created on : Apr 22, 2018, 4:48:14 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SMS - User Registration</title>

        <%@include file="links.jsp" %>
    </head>
    <body class="fixed-nav sticky-footer bg-dark" id="page-top">
        <!-- Navigation-->
        <%@include file="header.jsp" %>

        <div class="content-wrapper">
            <div class="container-fluid">
                <!-- Bread crumbs-->
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="#">User</a>
                    </li>
                    <li class="breadcrumb-item active">User registration</li>
                </ol>
                <!-- page content -->
                <div class="container">
                    <div class="card card-register mx-auto mt-5">
                        <div class="card-header">Add an User</div>
                        <div class="card-body">
                            <h1>Registration was successful.</h1>

                        </div>
                    </div>
                </div>
            </div>
            <!-- /.container-fluid-->
            <!-- /.content-wrapper-->
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
