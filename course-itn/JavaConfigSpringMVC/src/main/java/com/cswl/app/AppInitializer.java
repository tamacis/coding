/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author cswl
 */
public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext sc) throws ServletException {
     // Load spring web appliation configuration
     AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
     ac.register(SpringAppConfig.class);
     ac.setServletContext(sc);
     ac.refresh();
    
     // Create and register the DispatcherServlet
     DispatcherServlet servlet = new DispatcherServlet(ac);
     ServletRegistration.Dynamic registration = sc.addServlet("dispatcher", servlet);
     registration.setLoadOnStartup(1);
     registration.addMapping("/");
     
    }
    
}
