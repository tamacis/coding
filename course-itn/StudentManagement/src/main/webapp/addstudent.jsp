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
  <title>SM : Admin (Add student) </title>
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
        <li class="breadcrumb-item active">Add</li>
      </ol>
      <!-- page content -->
      <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Add an student</div>
      <div class="card-body">
          <form action="${pageContext.request.contextPath}/Admin/Student/Add" method="POST" >
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
                <label for="inputCountry">Country</label>
                <select class="form-control" name="inputCountry" id="inputCountry" >
                    <option value="NE" >Nepal </option>
                    <option value="IN" > India </option>
                    <option value="BN" >Bhutan</option>
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
                  <label for="">Hobbies</label><br>
                
                Swimming: <input name="inputHobby" value="swim" type="checkbox" >
                Music: <input name="inputHobby" value="music" type="checkbox" >
                Coding: <input name="inputHobby" value="code" type="checkbox" >
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
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <%@include file="footer.jsp" %>
  </div>
</body>

</html>
