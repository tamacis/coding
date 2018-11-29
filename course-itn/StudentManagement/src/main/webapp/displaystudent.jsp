<%-- 
    Document   : displaystudent
    Created on : Apr 4, 2018, 5:22:30 PM
    Author     : stim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SMS Admin</title>
  <%@include file="links.jsp" %>
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
  <%@include file="header.jsp" %>
  
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">Student</a>
        </li>
        <li class="breadcrumb-item active">Display</li>
      </ol>
      
   <!--page content-->
  <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> Student  Table </div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>First Name</th>
                  <th>Last Name</th>
                  
                  <th>Gender</th>
                  <th>Country</th>
                  <th>Hobbies</th>
                </tr>
              </thead>
              <tbody>
                  <c:forEach var="student" items="${studentdata}">
                      <tr>
                          <td>${student.id}</td>
                          <td>${student.firstName}</td>
                          <td>${student.lastName}</td>
                          
                          <td>${student.gender}</td>
                          <td>${student.country}</td>
                          <td>${student.hobbies}</td>
                          <td><a href="${cp}/Admin/Student/Edit?id=${student.id}">Edit</a></td>
                          <td><a href="${cp}/Admin/Student/Delete?id=${student.id}">Delete</a></td>
                      </tr>
                  </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
   
      
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <%@include file="footer.jsp" %>
  </div>
</body>

</html>
