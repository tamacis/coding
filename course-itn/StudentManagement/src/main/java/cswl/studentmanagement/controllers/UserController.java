/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.controllers;

import cswl.studentmanagement.modal.User;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author cswl
 */
@WebServlet(name = "UserController", urlPatterns = {"/Admin/User/Add"})
@MultipartConfig(
        fileSizeThreshold = 2 * 1024 * 1024, // 2MB
        maxFileSize = 10 * 1024 * 1024, // 10MB
        maxRequestSize = 50 * 1024 * 1024 // 50MB
)
public class UserController extends HttpServlet {

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

        if (url.equals(cp + "/Admin/User/Add")) {
            request.getRequestDispatcher("/userregis.jsp")
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

        String url = request.getRequestURI();
        String cp = request.getContextPath();

        if (url.equals(cp + "/Admin/User/Add")) {
            boolean uploadSucc = false;
            String uploadDir = request.getServletContext().getRealPath("");
            File savePath = new File(uploadDir + File.separator + "UserImages");
            if (!savePath.exists()) {
                savePath.mkdir();
            }
            String fname = "";
            String lname = "";
            String gender = "";
            String authr = "";
            String imgName = "";;
            for (Part part : request.getParts()) {
                if (part.getName().equals("inputImage")) {
                    String fileName = extractFileName(part);
                    fileName = new File(fileName).getName();
                    imgName = savePath + File.separator + fileName;
                    part.write(imgName);
                    uploadSucc = true;
                } else if (part.getName().equals("inputFname")) {
                    fname = request.getParameter("inputFname");
                } else if (part.getName().equals("inputLname")) {
                    lname = request.getParameter("inputLname");
                } else if (part.getName().equals("inputGender")) {
                    gender = request.getParameter("gender");
                } else if (part.getName().equals("inputAuthority")) {
                    authr = request.getParameter("inputAuthority");
                }
            }

            User user = new User(0, fname + " " + lname, gender, authr, imgName);
            if (uploadSucc) {
                request.getRequestDispatcher("/regsuccess.jsp")
                        .forward(request, response);
            } else {
                request.getRequestDispatcher("/regfailed.jsp")
                        .forward(request, response);

            }
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

    private String extractFileName(Part part) {
        String contDisp = part.getHeader("content-disposition");
        String[] items = contDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}
