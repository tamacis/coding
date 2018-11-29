<%-- 
    Document   : addcourse
    Created on : May 8, 2018, 4:30:16 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Course</title>
        <%@include file="head_links.jsp" %>
    </head>
    <body id="page-top">

        <header class="masthead" style="background-image: url('img/about-bg.jpg')">

            <h1>Add course information</h1>

        </header>

        <div class="content-wrapper">
            <div class="container-fluid">
                <!-- Breadcrumbs-->
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="#">Course</a>
                    </li>
                    <li class="breadcrumb-item active">Add</li>
                </ol>
                <!-- page content -->
                <div class="container">
                    <div class="card card-register mx-auto mt-5">
                        <div class="card-header">Add an course</div>
                        <div class="card-body">
                            <form action="${pageContext.request.contextPath}/admin/course/add?${_csrf.parameterName}=${_csrf.token}" method="POST" >
                                <div class="form-group">
                                    <div class="form-row">
                                        <div class="col-md-12">
                                            <label for="title">Course Title</label>
                                            <input class="form-control" name="title" id="title" type="text"
                                                   aria-describedby="nameHelp" placeholder="Enter course title">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-row">
                                        <div class="col-md-6">
                                            <label for="price">Course Price</label>
                                            <input class="form-control" name="price" id="price" type="text"
                                                   aria-describedby="nameHelp" placeholder="Enter course price">
                                        </div>
                                        <div class="col-md-6">
                                            <label for="duration">Course Duration</label>
                                            <input type="range" min="0" max="20" value="0" 
                                                   onchange="this.nextElementSibling.value = this.value" >
                                            <input type="number" min="0" max="20" value="0" 
                                                   class="form-control" name="duration" id="duration"
                                                   aria-describedby="nameHelp" placeholder="Enter course duration"
                                                   onchange="this.previousElementSibling.value = this.value" >

                                        </div>
                                    </div>
                                </div>  
                                <div class="form-group">

                                    <div class="form-row">
                                        <div class="col-md-6">
                                            <input type="submit" class="btn btn-primary btn-block" value="Add" >
                                        </div>

                                        <div class="col-md-6">
                                            <input type="reset" class="btn btn-primary btn-block" value="Reset Fields" >
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <div class="text-center">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="footer_links.jsp" %>
    </body>
</html>
