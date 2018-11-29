<%-- 
    Document   : displayCourse
    Created on : May 10, 2018, 4:37:04 PM
    Author     : PemaSamtenLama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Spring FrameWork</title>
  <%@include file="head_links.jsp" %>
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="${pageContext.request.contextPath}/admin/course/display">Course</a>
        </li>
        <li class="breadcrumb-item active">Display</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> Course Table</div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>Title</th>
                  <th>Price</th>
                  <th>Duration</th>
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <th>Id</th>
                  <th>Title</th>
                  <th>Price</th>
                  <th>Duration</th>
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
              </tfoot>
              <tbody>
                
                    <c:forEach var="course" items="${coursedata}">
                    <tr>
                        <td>${course.id}</td>
                        <td>${course.title}</td>
                        <td>${course.price}</td>
                        <td>${course.duration}</td>
                        <td><a href="${pageContext.request.contextPath}/admin/course/edit/${course.id}">Edit</a></td>
                        <td><a href="${pageContext.request.contextPath}/admin/course/delete/${course.id}">Delete</a></td>
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
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © Your Website 2017</small>
        </div>
      </div>
    </footer>
</body>

</html>







