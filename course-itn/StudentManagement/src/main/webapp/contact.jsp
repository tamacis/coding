<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Contact</title>
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <%@include file="frontendlinks.jsp" %>
    </head>
   <body>
     <!-- Contact -->
    <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading">Contact Us</h2>
            <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-12">
            <form id="contactForm" name="sentMessage" novalidate>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <input class="form-control" id="name" type="text" placeholder="Your Name *" required data-validation-required-message="Please enter your name.">
                    <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group">
                    <input class="form-control" id="email" type="email" placeholder="Your Email *" required data-validation-required-message="Please enter your email address.">
                    <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group">
                    <input class="form-control" id="phone" type="tel" placeholder="Your Phone *" required data-validation-required-message="Please enter your phone number.">
                    <p class="help-block text-danger"></p>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <textarea class="form-control" id="message" placeholder="Your Message *" required data-validation-required-message="Please enter a message."></textarea>
                    <p class="help-block text-danger"></p>
                  </div>
                </div>
                <div class="clearfix"></div>
                <div class="col-lg-12 text-center">
                  <div id="success"></div>
                  <button id="sendMessageButton" class="btn btn-xl" type="submit">Send Message</button>
                  </br>
                </div>  </br>

    <div class="row-fluid">
        <div class="span8">
            <div style="border: 15px">
        	<iframe width="600" height="450" frameborder="0" style="border-top: 0" src="https://www.google.com/maps/embed/v1/place?q=kathmandu%2Cputalisadak&key=AIzaSyBNHccn5t6ItC-7ihYaFujjKiP84Ty3aEM" allowfullscreen></iframe>
    	</div>
            </div>
             
    <div class="span3" style="color:white">
        <h2>SMS</h2>
            <address>
                <strong>System</strong><br>
    		<strong>Satungal, Kathmandu<br>
    		Naikap<br>
    		Putalisadak<br>
    		Nepal<br>
    		CT21 5SH<br>
    		<abbr title="Phone">P:</abbr> 01234 567 890
            </address>
    </div>
</div>
    <script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendor/popper/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.min.js"></script>
                 <!-- Contact form JavaScript -->
    <script src="${pageContext.request.contextPath}/js/jqBootstrapValidation.js"></script>
    <script src="${pageContext.request.contextPath}/js/contact_me.js"></script>
   <script src="${pageContext.request.contextPath}/js/agency.min.js"></script>
   </body>
</html>