<%-- 
    Document   : editStudent
    Created on : May 15, 2018, 2:28:06 PM
    Author     : PemaSamtenLama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
        <%@include file="links.jsp" %>
    </head>
    <body class="fixed-nav sticky-footer bg-dark" id="page-top">
        <div class="content-wrapper">
    <div class="container-fluid">
       <!--Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">Student</a>
        </li>
        <li class="breadcrumb-item active">Edit Student</li>
      </ol>
       <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Edit Student</div>
      <div class="card-body">
        <%@include file="nav.jsp" %>
        <form 
            action="${pageContext.request.contextPath}/admin/student/update${_csrf.parameterName}=${_csrf.token}" 
            method="POST">
            <div class="form-group">
                <div class="form-row">
                    <div class="col-sm-2">
                        <label>Id :</label>
                        <input class="form-control" type="text" name="id" value="${studentdata.id}" readonly/>
                    </div>
            <div class="col-sm-5">
            <label>First Name :</label>
            <input class="form-control" type="text" name="firstname" value="${studentdata.firstname}"/>
            </div>
            <div class="col-sm-5">
            <label>Last Name :</label>
            <input class="form-control" type="text" name="lastname" value="${studentdata.lastname}"/>
            </div>
                </div>
            </div>
            <div class="form-group">
                <div class="form-row">
                    <div class="col-sm-7"
                        <label for="country">Country</label>
                            <select class="form-control" name="country" id="country">
                                <option value="Nepal" <c:if test="${studentdata.country.equals('Nepal')}">selected</c:if>>Nepal</option>
                                <option value="India"<c:if test="${studentdata.country.equals('India')}">selected</c:if>>India</option>
                                <option value-="Bhutan"<c:if test="${studentdata.country.equals('Bhutan')}">selected</c:if>>Bhutan</option>
                                <option value="Sri Lanka"<c:if test="${studentdata.country.equals('Sri Lanka')}">selected</c:if>>Sri Lanka</option>
                                <option value="Bangladesh" <c:if test="${studentdata.country.equals('Bangladesh')}">selected</c:if>>Bangladesh</option>
                             </select>
                    </div>
                    <div class="col-sm-5">
                        <label>Gender</label><br>
                            <input type="radio" name="gender" value="M"<c:if test="${studentdata.gender.equals('M')}">checked</c:if>> Male &nbsp;
                            <input type="radio" name="gender" value="F"<c:if test="${studentdata.gender.equals('F')}">checked</c:if>> Female
                    </div>
                </div>
            </div>
                    <div class="form-group" style="text-align:center;">
                <div class="form-row">
                    <div class="col-sm-12">
                        <label>Hobbies</label><br>
                        <input  type="checkbox" name="hobbies" value="Swimming" <c:if test="${studentdata.hobbies.contains('Swimming')}">checked</c:if>> Swimming &nbsp;&nbsp; 
                        <input type="checkbox" name="hobbies" value="Dancing" <c:if test="${studentdata.hobbies.contains('Dancing')}">checked</c:if>> Dancing &nbsp;&nbsp;
                        <input type="checkbox" name="hobbies" value="Playing" <c:if test="${studentdata.hobbies.contains('Playing')}">checked</c:if>> Playing &nbsp;&nbsp;
                        <input type="checkbox" name="hobbies" value="Singing" <c:if test="${studentdata.hobbies.contains('Singing')}">checked</c:if>> Singing
                    </div>
                </div>
            </div>
            <div class="form-group">
            <div class="form-row text-center">
                
              <div class="col-md-12">                  
                  <input class="btn btn-primary btn-block" type="submit" value="Update Student"/>
              </div>
              
            
            </div>
          </div>
        </form>
            </div>
    </div>
      </div>
    </div>
     
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

    <%@include file="scripts.jsp" %>
  </div>
  </body>

</html>


      
    