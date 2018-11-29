/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.controllers;

import cswl.studentmanagement.dao.CountryDao;
import cswl.studentmanagement.dao.StudentDao;
import cswl.studentmanagement.modal.Student;
import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cswl
 */
@WebServlet(name = "StudentController",
        urlPatterns = {"/Admin/Student/Add", "/Admin/Student/Display",
            "/Admin/Student/Edit", "/Admin/Student/Update", "/Admin/Student/Delete"})
public class StudentController extends HttpServlet {

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
        StudentDao sd = new StudentDao();
        CountryDao cd = new CountryDao();

        if (url.equals(cp + "/Admin/Student/Add")) {
            request.getRequestDispatcher("/addstudent.jsp")
                    .forward(request, response);
        } else if (url.equals(cp + "/Admin/Student/Display")) {
            
            request.setAttribute("countrydata", cd.selectAll());
            request.setAttribute("studentdata", sd.selectAll());
//            System.out.println(sd.selectAll());
            request.getRequestDispatcher("/displaystudent.jsp")
                    .forward(request, response);
        } else if (url.equals(cp + "/Admin/Student/Edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("studentdata", sd.selectById(id));
            request.getRequestDispatcher("/editstudent.jsp")
                    .forward(request, response);
        } else if (url.equals(cp + "/Admin/Student/Delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            sd.delete(id);
            // redirect to addStudent page
            response.sendRedirect(cp + "/Admin/Student/Display");
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
        StudentDao sd = new StudentDao();

        if (url.equals(cp + "/Admin/Student/Add")) {

            String fname = request.getParameter("inputFname");
            String lname = request.getParameter("inputLname");
            String country = request.getParameter("inputCountry");
            String gender = request.getParameter("inputGender");
            String[] hobbies = request.getParameterValues("inputHobby");
            String hobby = Arrays.toString(hobbies);

            Student s = new Student(0, fname, lname, country, gender, hobby);
            System.out.println(s);
            sd.insert(s);
            response.sendRedirect(cp + "/Admin/Student/Add");

        } else if (url.equals(cp + "/Admin/Student/Update")) {

            int id = Integer.parseInt(request.getParameter("inputId"));
            String fname = request.getParameter("inputFname");
            String lname = request.getParameter("inputLname");
            String country = request.getParameter("inputCountry");
            String gender = request.getParameter("inputGender");
            String[] hobbies = request.getParameterValues("inputHobby");
            String hobby = Arrays.toString(hobbies);

            Student s = new Student(id, fname, lname, country, gender, hobby);
            System.out.println(s);
            sd.update(s);
            response.sendRedirect(cp + "/Admin/Student/Display");

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
