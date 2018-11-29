/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cswl
 */
public class HomeController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        String jsp = "";
        if (url.equals(cp + "/home")) {
            jsp = "index.jsp";
        } else if (url.equals(cp + "/about")) {
            ArrayList<Course> al = new ArrayList<>();
            al.add(new Course(1002,"Java", "2 M", 10000));
            al.add(new Course(1003,"PHP", "2 M", 12000));
            
            request.setAttribute("course_list", al);
            String cname = "IT Nepal Pvt. Ltd";
            request.setAttribute("company_name", cname);
            jsp = "about.jsp";
        } else if (url.equals(cp + "/contact")) {
            jsp = "contact.jsp";
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        
        rd.forward(request, response);
        
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
        String jsp = "";
        if (url.equals(cp + "/feedback")) {
            String user = request.getParameter("uname");
            String remarks = request.getParameter("uremarks");
            // Form processing:
            System.out.println(user + " " + remarks);
            // Form process
//
//            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//            rd.forward(request, response);
            response.sendRedirect(cp+  "/home");
            
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
