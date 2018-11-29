<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <!DOCTYPE html>
  <html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>

    <%@include file="frontheader.jsp" %>
  </head>

  <body id="page-top">

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top">Student Management</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
          data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
          aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="${cp}/Home">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="${cp}/#services">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="${cp}/#portfolio">Course</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="${cp}/#contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <header class="masthead">
      <div class="header-content">
        <div class="header-content-inner">
          <h1 id="homeHeading">Student Management System</h1>
          <hr>
          <p>Start Bootstrap can help you build better websites using the Bootstrap
            CSS framework! Just download your template and start going, no strings
            attached!</p>
          <a class="btn btn-primary btn-xl js-scroll-trigger" href="#about">Find Out More</a>
        </div>
      </div>
    </header>

    <section class="bg-primary" id="about">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 mx-auto text-center">
            <h2 class="section-heading text-white">We've got what you need!</h2>
            <hr class="light">
            <p class="text-faded">Start Bootstrap has everything you need to get your new website up and
              running in no time! All of the templates and themes on Start Bootstrap
              are open source, free to download, and easy to use. No strings attached!</p>
            <a class="btn btn-default btn-xl js-scroll-trigger" href="#services">Get Started!</a>
          </div>
        </div>
      </div>
    </section>

    <section id="services">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading">At Your Service</h2>
            <hr class="primary">
          </div>
        </div>
      </div>
      <div class="container">
        <div class="row">
          <div class="col-lg-3 col-md-6 text-center">
            <div class="service-box">
              <i class="fa fa-4x fa-diamond text-primary sr-icons"></i>
              <h3>Sturdy Templates</h3>
              <p class="text-muted">Our templates are updated regularly so they don't break.</p>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 text-center">
            <div class="service-box">
              <i class="fa fa-4x fa-paper-plane text-primary sr-icons"></i>
              <h3>Ready to Ship</h3>
              <p class="text-muted">You can use this theme as is, or you can make changes!</p>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 text-center">
            <div class="service-box">
              <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i>
              <h3>Up to Date</h3>
              <p class="text-muted">We update dependencies to keep things fresh.</p>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 text-center">
            <div class="service-box">
              <i class="fa fa-4x fa-heart text-primary sr-icons"></i>
              <h3>Made with Love</h3>
              <p class="text-muted">You have to make your websites with love these days!</p>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="p-0" id="portfolio">
      <div class="container-fluid">
        <div class="row no-gutter popup-gallery">
          <div class="col-lg-4 col-sm-6">
            <a class="portfolio-box" href="img/portfolio/fullsize/1.jpg">
                            <img class="img-fluid" src="img/portfolio/thumbnails/1.jpg" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
          </div>
          <div class="col-lg-4 col-sm-6">
            <a class="portfolio-box" href="img/portfolio/fullsize/2.jpg">
                            <img class="img-fluid" src="img/portfolio/thumbnails/2.jpg" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
          </div>
          <div class="col-lg-4 col-sm-6">
            <a class="portfolio-box" href="img/portfolio/fullsize/3.jpg">
                            <img class="img-fluid" src="img/portfolio/thumbnails/3.jpg" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
          </div>
          <div class="col-lg-4 col-sm-6">
            <a class="portfolio-box" href="img/portfolio/fullsize/4.jpg">
                            <img class="img-fluid" src="img/portfolio/thumbnails/4.jpg" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
          </div>
          <div class="col-lg-4 col-sm-6">
            <a class="portfolio-box" href="img/portfolio/fullsize/5.jpg">
                            <img class="img-fluid" src="img/portfolio/thumbnails/5.jpg" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
          </div>
          <div class="col-lg-4 col-sm-6">
            <a class="portfolio-box" href="img/portfolio/fullsize/6.jpg">
                            <img class="img-fluid" src="img/portfolio/thumbnails/6.jpg" alt="">
                            <div class="portfolio-box-caption">
                                <div class="portfolio-box-caption-content">
                                    <div class="project-category text-faded">
                                        Category
                                    </div>
                                    <div class="project-name">
                                        Project Name
                                    </div>
                                </div>
                            </div>
                        </a>
          </div>
        </div>
      </div>
    </section>

    <div class="call-to-action bg-dark">
      <div class="container text-center">
        <h2>Free Download at Start Bootstrap!</h2>
        <a class="btn btn-default btn-xl sr-button" href="http://startbootstrap.com/template-overviews/creative/">Download Now!</a>
      </div>
    </div>

    <section id="contact">
      <div class="container">
          
     <!-- Contact -->
       <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading">Contact Us</h2>
            <h3 class="section-subheading text-muted">Give us a call
              or send use the form below and we will get back to you as soon as possible!</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-12">
            <form id="contactForm" name="sentMessage" novalidate>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <input class="form-control" id="name" type="text" placeholder="Your Name *" required 
                           data-validation-required-message="Please enter your name.">
                    <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group">
                    <input class="form-control" id="email" type="email" placeholder="Your Email *"
                           required data-validation-required-message="Please enter your email address.">
                    <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group">
                    <input class="form-control" id="phone" type="tel" placeholder="Your Phone *" 
                           required data-validation-required-message="Please enter your phone number.">
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
        	<iframe width="600" height="450" frameborder="0" style="border-top: 0" 
                        src="https://www.google.com/maps/embed/v1/place?q=kathmandu%2Cputalisadak&key=AIzaSyBNHccn5t6ItC-7ihYaFujjKiP84Ty3aEM" 
                        allowfullscreen></iframe>
    	</div>
            </div>
             
    <div class="span3" style="">
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
        <div class="row">
          <div class="col-lg-8 mx-auto text-center">
            <h2 class="section-heading">Let's Get In Touch!</h2>
            <hr class="primary">
            <p>Ready to start your next project with us? </p>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-4 ml-auto text-center">
            <i class="fa fa-phone fa-3x sr-contact"></i>
            <p>123-456-6789</p>
          </div>
          <div class="col-lg-4 mr-auto text-center">
            <i class="fa fa-envelope-o fa-3x sr-contact"></i>
            <p>
              <a href="mailto:your-email@your-domain.com">feedback@startbootstrap.com</a>
            </p>
          </div>
        </div>
      </div>
    </section>


    <%@include file="frontfooter.jsp" %>

  </body>

  </html>
