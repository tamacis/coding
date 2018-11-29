<%-- 
    Document   : login
    Created on : Apr 11, 2018, 5:01:19 PM
    Author     : cswl
--%>

  <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Login - </title>
      <%@include file="links.jsp" %>
    </head>

    <body class="bg-dark">
      <div class="container">
        <div class="card card-login mx-auto mt-5">
          <div class="card-header">Login</div>
          <div class="card-body">
            <form method="POST" action="${pageContext.request.contextPath}/Login">
              <div class="form-group">
                <label for="exampleInputEmail1">Username</label>
                <input class="form-control" name="inputUname" id="inputUname" type="text" 
                aria-describedby="emailHelp" placeholder="Enter username">
              </div>
              <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input class="form-control" name="inputPassword" id="inputPassword" type="password"
                 placeholder="Password">
              </div>
              <div class="form-group">
                <div class="form-check">
                  <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
                </div>
              </div>
              <input class="btn btn-primary btn-block" type="submit" value="Login">
            </form>
            <div class="text-center">
              <a class="d-block small mt-3" href="#">Register an Account</a>
              <a class="d-block small" href="#">Forgot Password?</a>
            </div>
          </div>
        </div>
      </div>

      <%@include file="footer.jsp" %>
    </body>

    </html>
