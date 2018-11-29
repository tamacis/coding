/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cswl
 */
@WebServlet(name = "HomepageController",
        urlPatterns = {"/Home", "/404", "/Login", "/Logout", "/Contact"})
public class HomepageController extends HttpServlet {

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

        String cp = request.getContextPath();
        String url = request.getRequestURI();

        if (url.equals(cp + "/Home")) {
            request.getRequestDispatcher("/index.jsp")
                    .forward(request, response);

        } else if (url.equals(cp + "/Contact")) {
            request.getRequestDispatcher("/contact.jsp")
                    .forward(request, response);
        } else if (url.equals(cp + "/404")) {
            response.sendRedirect("/notfound.jsp");

        } else if (url.equals(cp + "/Login")) {
            request.getRequestDispatcher("/login.jsp")
                    .forward(request, response);

        } else if (url.equals(cp + "/Logout")) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate();
                response.sendRedirect(cp + "/Login/?logout");
            }
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

        String cp = request.getContextPath();
        String url = request.getRequestURI();

        if (url.equals(cp + "/Login")) {
            String uname = request.getParameter("inputUname");
            String password = request.getParameter("inputPassword");

            System.out.println(uname + password);
            if (uname.equals("admin") && password.equals("admin")) {
                HttpSession session = request.getSession();
                session.setAttribute("user", uname);
                response.sendRedirect(cp + "/Admin/Home");

            } else {
                response.sendRedirect(cp + "/Login?failure");
            }

//                
//              //                
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
