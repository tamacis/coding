<%-- 
    Document   : userregis
    Created on : Apr 22, 2018, 3:46:34 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SM : Admin (Add User) </title>
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
        <li class="breadcrumb-item active">Add</li>
      </ol>
      <!-- page content -->
      <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Add an User</div>
      <div class="card-body">
          <form action="${pageContext.request.contextPath}/Admin/User/Add" 
                method="POST" enctype="multipart/form-data" >
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="inputFname">First Name</label>
                <input class="form-control" name="inputFname" id="inputFname" type="text"
                       aria-describedby="nameHelp" placeholder="Enter first name">
              </div>
                
              <div class="col-md-6">
                <label for="inputFname">Last Name</label>
                <input class="form-control" name="inputLname" id="inputLname" type="text"
                       aria-describedby="nameHelp" placeholder="Enter last name">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="inputAuthority">Authority</label>
                <select class="form-control" name="inputAuthority" id="inputAuthority" >
                    <option>Administrator</option>
                    <option>Registered User</option>
                    <option>Anonymous User</option>
                </select>
              </div>
           <div class="col-md-6">
               <label>Gender</label><br>
                Male: <input name="inputGender" value="male" type="radio" >
                Female: <input name="inputGender" value="female" type="radio" >
              </div>
            </div>
          </div>
          
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                  <label for="inputImage">Image to upload</label><br>
                
                <input name="inputImage" id="inputImage"   type="file" >
                
                </div>
            </div>
          <div class="form-group">
          
                      <div class="form-row">
              <div class="col-md-6">
          <input type="submit" class="btn btn-primary btn-block" value="Submit" >
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
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <%@include file="footer.jsp" %>
  </div>
</body>

</html>
