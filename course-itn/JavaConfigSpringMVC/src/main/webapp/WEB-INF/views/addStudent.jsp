<%-- 
    Document   : addStudent
    Created on : May 14, 2018, 3:56:07 PM
    Author     : PemaSamtenLama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="_csrf" content="${_csrf.token}"/>
        <meta name="_csrf_header" content="${_csrf.headerName}"/>
        <title>Add Student</title>
        <%@include file="head_links.jsp"%>
    </head>
    <body class="fixed-nav sticky-footer bg-dark" id="page-top">
        <!-- Navigation-->

        <div class="content-wrapper">
            <div class="container-fluid">
                <!-- Breadcrumbs-->
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="#">Student</a>
                    </li>
                    <li class="breadcrumb-item active">Add</li>
                </ol>
                <div class="container">
                    <div class="card card-register mx-auto mt-5">
                        <div class="card-header">Add Student</div>
                        <div class="card-body">
                            <form action="${pageContext.request.contextPath}/admin/student/add?${_csrf.parameterName}=${_csrf.token}"
                                  enctype="multipart/form-data" method="POST">

                                <div class="form-group">
                                    <div class="form-row">
                                        <div class="col-md-6">
                                            <label for="firstname">First Name</label>
                                            <input class="form-control"  type="text" name="firstname" required placeholder="Enter First Name">
                                        </div> 
                                        <div class="col-md-6">
                                            <label for="lastname">Last Name</label>
                                            <input class="form-control"  type="text" name="lastname" required placeholder="Enter Last Name">
                                        </div>  
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="form-row">
                                        <div class="col-md-6">
                                            <label for="country">Country</label><br>
                                            <select class="form-control" name="country" id="country">
                                                <option value="Nepal">Nepal</option>
                                                <option value="India">India</option>
                                                <option value-="Bhutan">Bhutan</option>
                                                <option value="Sri Lanka">Sri Lanka</option>
                                                <option value="Bangladesh">Bangladesh</option>
                                            </select>
                                        </div>

                                        <div class="col-md-6">
                                            <label for="gender">Gender</label><br>
                                            <input id="gender1" name="gender" type="radio" value="M"> Male &nbsp;&nbsp;
                                            <input id="gender1" name="gender" type="radio" value="F"> Female 
                                        </div> 
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="form-row">
                                        <div class="col-md-6">
                                            <label for="hobbies">Hobbies</label><br>
                                            <input  id="hobbies1" type="checkbox" name="hobbies" value="Swimming"> Swimming &nbsp;       
                                            <input  id="hobbies2" type="checkbox" name="hobbies" value="Dancing"> Dancing &nbsp;
                                            <input  id="hobbies3" type="checkbox" name="hobbies" value="Singing"> Singing &nbsp;
                                            <input  id="hobbies3" type="checkbox" name="hobbies" value="Playing"> Playing
                                        </div> 
                                        <div class="col-sm-6">
                                            <label for="image">Image to upload</label><br>
                                            <input id="image" name="image" type="file"><br><br>
                                        </div>
                                        <div class="col-sm-12 text-center">
                                            Status : ${msg}
                                        </div>

                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="form-row text-center">

                                        <div class="col-md-6">                  
                                            <input class="btn btn-primary btn-block" type="submit" value="Add Student"/>
                                        </div>
                                        <div class="col-md-6">
                                            <input class="btn btn-danger btn-block" type="reset" value="Reset"/>
                                        </div>

                                    </div>
                                </div>


                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <!-- /.container-fluid-->
            <!-- /.content-wrapper-->
            <footer class="sticky-footer">
                <div class="container">
                    <div class="text-center">
                        <small>Copyright © Your Website 2017</small>
                    </div>
                </div>
            </footer>
            <!-- Scroll to Top Button-->
            <a class="scroll-to-top rounded" href="#page-top">
                <i class="fa fa-angle-up"></i>
            </a>
            <!-- Logout Modal-->
            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </div>
                        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <a class="btn btn-primary" href="login.html">Logout</a>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </body>

</html>
