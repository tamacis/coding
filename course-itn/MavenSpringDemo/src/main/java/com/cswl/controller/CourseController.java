/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.controller;

import com.cswl.model.Course;
import com.cswl.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PemaSamtenLama
 */
@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/admin/course/add", method = RequestMethod.GET)
    public String addCourse() {
        return "addCourse";
    }

    @RequestMapping(value = "/admin/course/add", method = RequestMethod.POST)
    public String saveCourse(@RequestParam("title") String ctitle,
            @RequestParam("price") Float cprice,
            @RequestParam("duration") String cduration, Model model) {

        boolean formOk = true;
        if (ctitle.equals("")) {
            model.addAttribute("titleMsg", "title not set");
            formOk = false;
        }
        if (cprice == null) {
            model.addAttribute("priceMsg", "price not set");
            formOk = false;
        }
        if (cduration.equals("")) {
            model.addAttribute("durationMsg", "duration not set");
            formOk = false;
        }
        if (formOk) {
            Course cm = new Course();
            cm.setTitle(ctitle);
            cm.setPrice(cprice);
            cm.setDuration(cduration);
            courseService.addCourse(cm);
            System.out.println(cm.getTitle());
            System.out.println(cm.getPrice());
            System.out.println(cm.getDuration());
        }
        
        return "redirect:/admin/course/display";
    }

    @RequestMapping(value = "/admin/course/display", method = RequestMethod.GET)
    public String showAllCourses(Model model) {
        model.addAttribute("coursedata", courseService.getAllCourse());
        return "displayCourse";
    }

    @GetMapping("/admin/course/edit/{id}")
    public String editCourse(@PathVariable("id") int id, Model model) {
        System.out.println("Edit Id:" + id);
        model.addAttribute("coursedata", courseService.getCourseByID(id));
        return "editCourse";
    }

    @PostMapping("admin/course/update")
    public String updateCourse(@ModelAttribute("course") Course cm) {
        // update using courseService
        System.out.println(cm);
        courseService.updateCourse(cm);

        return "redirect:/admin/course/display";
    }

    @GetMapping("/admin/course/delete/{id}")
    public String updateCourse(@PathVariable("id") int id, Model model) {
        Course cm = new Course();
        cm.setId(id);
        courseService.deleteCourse(cm);
        return "redirect:/admin/course/display";
    }

}
