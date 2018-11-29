/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.controllers;

import cswl.studentmanagement.dao.CourseDao;
import cswl.studentmanagement.dao.RelationDao;
import cswl.studentmanagement.dao.StudentDao;
import cswl.studentmanagement.modal.StudentCourse;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cswl
 */
@WebServlet(name = "RelationController", urlPatterns = {"/Relation"})
public class RelationController extends HttpServlet {

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
        StudentDao sd = new StudentDao();
        CourseDao cd = new CourseDao();

        String action = request.getParameter("action");
        
        // default action;
        if (action == null ) {
            action = "add";
        }
        if (action.equalsIgnoreCase("add")) {
            request.setAttribute("studentdata", sd.selectAll());
            request.setAttribute("coursedata", cd.selectAll());
            request.getRequestDispatcher("/addrelation.jsp")
                    .forward(request, response);
        } else if(action.equalsIgnoreCase("display")) {
            ArrayList<StudentCourse> al = RelationDao.getStudents() ;
            request.setAttribute("stcudata", al);
            request.getRequestDispatcher("displayrelation.jsp")
                    .forward(request, response);
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
        StudentDao sd = new StudentDao();
        CourseDao cd = new CourseDao();
        RelationDao rd = new RelationDao();

        String action = request.getParameter("action");
        
        // default action;
        if (action == null ) {
            action = "add";
        }
        
        if (action.equalsIgnoreCase("save")) {
            int sid = Integer.parseInt(request.getParameter("student"));
            int cid = Integer.parseInt(request.getParameter("course"));
            rd.addRelation(sid, cid);
            response.sendRedirect(request.getContextPath() + "/Relation?action=add") ;
            
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
