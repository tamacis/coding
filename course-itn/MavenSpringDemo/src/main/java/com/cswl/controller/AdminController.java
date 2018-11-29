/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author cswl
 */
@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminHome() {
        return "adminPanelHome";
    }

    @GetMapping("/login")
    public String userLogin() {
        return "login";
    }

    @GetMapping("/logout")
    public String userLogout(HttpServletRequest req, HttpServletResponse resp) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            // model.addAttribute("LogoutSucessful", "Logout sucessful!");

        }
        return "login";
    }
}
