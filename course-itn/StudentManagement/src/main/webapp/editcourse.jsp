<%-- 
    Document   : adminpanel
    Created on : Apr 1, 2018, 4:44:43 PM
    Author     : stim
--%>

  <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>SM : Admin (Update course) </title>
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
                <a href="#">Course</a>
              </li>
              <li class="breadcrumb-item active">Edit</li>
            </ol>
            <!-- page content -->
            <div class="container">
              <div class="card card-register mx-auto mt-5">
                <div class="card-header">Update course</div>
                <div class="card-body">
                  <form action="${pageContext.request.contextPath}/Admin/Course/Update" method="POST">
                    <div class="form-group">
                      <div class="form-row">
                        <div class="col-md-12">
                          <label for="inputID">Course ID</label>
                          <input class="form-control" name="inputId" readonly type="text" aria-describedby="nameHelp"
                            value="${coursedata.id}">
                        </div>
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="form-row">
                        <div class="col-md-12">
                          <label for="inputTitle">Course Title</label>
                          <input class="form-control" name="inputTitle" id="inputTitle" type="text" aria-describedby="nameHelp"
                            value="${coursedata.title}">
                        </div>
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="form-row">
                        <div class="col-md-6">
                          <label for="inputPrice">Course Price</label>
                          <input class="form-control" name="inputPrice" id="inputPrice" type="text" aria-describedby="nameHelp"
                            value="${coursedata.price}">
                        </div>
                        <div class="col-md-6">
                          <label for="inputDuration">Course Duration</label>
                          <input type="range" min="0" max="20" value="0" onchange="this.nextElementSibling.value = this.value">
                          <input type="number" id="inputDuration" name="inputDuration" min="0" max="20" value="0"
                            class="form-control" name="inputDuration" aria-describedby="nameHelp"
                            value="${coursedata.duration}" onchange="this.previousElementSibling.value = this.value">

                        </div>
                      </div>
                    </div>
                    <div class="form-group">

                      <div class="form-row">
                        <div class="col-md-6">
                          <input type="submit" class="btn btn-primary btn-block" value="Update" </div>
                        </div>
                        <div class="col-md-6">
                          <input type="reset" class="btn btn-primary btn-block" value="Reset Fields">
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
          <!-- /.container-fluid-->
          <!-- /.content-wrapper-->
          <%@include file="footer.jsp" %>
        </div>
    </body>

    </html>
