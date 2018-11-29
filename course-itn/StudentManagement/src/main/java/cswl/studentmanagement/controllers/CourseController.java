/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.controllers;

import cswl.studentmanagement.modal.Course;
import cswl.studentmanagement.dao.CourseDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cswl
 */
public class CourseController extends HttpServlet {
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getRequestURI();
        String cp = request.getContextPath();
        CourseDao cd = new CourseDao();

        if (url.equals(cp + "/Admin/Course/Add")) {
            RequestDispatcher rd
                    = request.getRequestDispatcher("/addcourse.jsp");
            rd.forward(request, response);
        } else if (url.equals(cp + "/Admin/Course/Display")) {
            request.setAttribute("coursedata", cd.selectAll());
            RequestDispatcher rd
                    = request.getRequestDispatcher("/displaycourse.jsp");
            rd.forward(request, response);
        } else if (url.equals(cp + "/Admin/Course/Edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("coursedata", cd.selectById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/editcourse.jsp");
            rd.forward(request, response);
        } else if (url.equals(cp + "/Admin/Course/Delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            cd.delete(id);
            // redirect to addcourse page
            response.sendRedirect(cp + "/Admin/Course/Display");   
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = request.getRequestURI();
        String cp = request.getContextPath();
        CourseDao cd = new CourseDao();

        if (url.equals(cp + "/Admin/Course/Add")) {
            // collect data from request object
            String title = request.getParameter("inputTitle");
            int price = Integer.parseInt(request.getParameter("inputPrice"));
            String duration = request.getParameter("inputDuration");

            // ad data to modal object
            Course cm = new Course();
            cm.setTitle(title);
            cm.setPrice(price);
            cm.setDuration(duration);

            // send object to doa to be inserted into database
            cd.insert(cm);
            // redirect to addcourse page
            response.sendRedirect(cp + "/Admin/Course/Display");
        } else if (url.equals(cp + "/Admin/Course/Update")) {
            // collect edit data
            int id = Integer.parseInt(request.getParameter("inputId"));
            String title = request.getParameter("inputTitle");
            int price = Integer.parseInt(request.getParameter("inputPrice"));
            String duration = request.getParameter("inputDuration");
            
            // send to Dao
            Course cm = new Course(id, title, price, duration);
            cd.update(cm);
            // redirect to display page
            response.sendRedirect(cp + "/Admin/Course/Display");

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
