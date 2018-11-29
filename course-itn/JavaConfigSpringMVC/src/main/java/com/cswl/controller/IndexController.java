package com.cswl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cswl
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage() {
        return "about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactPage() {
        return "contact";
    }

}
