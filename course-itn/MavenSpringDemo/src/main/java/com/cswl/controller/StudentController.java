/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.controller;

import com.cswl.model.Student;
import com.cswl.service.StudentService;
import java.util.Arrays;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PemaSamtenLama
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value="/admin/student/add",method=RequestMethod.GET)
    public ModelAndView addStudent(ModelAndView mv){
        mv.setViewName("addStudent");
        return mv;
    }
    @PostMapping(value="/admin/student/add")
    public ModelAndView saveStudent(
                              @RequestParam("firstname")String firstname,
                              @RequestParam("lastname")String lastname,
                              @RequestParam("country")String country,
                              @RequestParam("gender")String gender,
                              @RequestParam("hobbies")String[] hobbies,
                              @RequestParam("image")MultipartFile file , ModelAndView mv){
        
        Student sm = new Student();
        sm.setFirstname(firstname);
        sm.setLastname(lastname.toUpperCase());
        sm.setCountry(country);
        sm.setGender(gender);
        sm.setHobbies(Arrays.toString(hobbies));
        sm.setImage(file.getOriginalFilename());
        
        if(studentService.saveImage(file)){
            System.out.println(sm.getFirstname());
            // if file uplaoded properly then save otherdata as well
            studentService.insert(sm);
            mv.addObject("msg","upload successful");
        }else{
            mv.addObject("msg","upload failed");
        }
        mv.setViewName("addStudent");
        return mv;
    }
    @RequestMapping(value="/admin/student/display",method=RequestMethod.GET)
        public String displayStudent(Model model){
        model.addAttribute("studentdata",studentService.selectAll());
        return "displayStudent";
    }
    @RequestMapping(value="/admin/student/edit/{id}",method=RequestMethod.GET)
        public String selectStudent(@PathVariable("id") int id,Model model){
        model.addAttribute("studentdata",studentService.selectById(id));
        return "editStudent";
    }
//    @PostMapping(value="/admin/student/update")
//    public String updateStudent(@ModelAttribute("Student") Student sm){
//        studentService.update(sm);
//        return "redirect:/admin/student/display";
//    }
    @GetMapping(value="/admin/student/delete/{id}")
    public String deleteStudent(@PathVariable("id")int id,Model model){
       Student sm = new Student();
       sm.setId(id);
       studentService.delete(sm);
       return "redirect:/admin/student/display";
    }
    @PostMapping(value="/admin/student/update")
    public ModelAndView updateStudentwithImage(
                              @RequestParam("id")int id,
                              @RequestParam("firstname")String firstname,
                              @RequestParam("lastname")String lastname,
                              @RequestParam("country")String country,
                              @RequestParam("gender")String gender,
                              @RequestParam("hobbies")String[] hobbies,
                              @RequestParam("originalImage")String originalImage,
                              @RequestParam("image")MultipartFile file , ModelAndView mv){
        
        Student sm = new Student();
        sm.setId(id);
        sm.setFirstname(firstname);
        sm.setLastname(lastname.toUpperCase());
        sm.setCountry(country);
        sm.setGender(gender);
        sm.setHobbies(Arrays.toString(hobbies));
        
        String newFile;
        
        if(!(file.isEmpty()) && (!(newFile = file.getOriginalFilename()).equals(originalImage))){
           sm.setImage(newFile);
           
        if(studentService.updateStudentwithImage(file, originalImage)){
            System.out.println(sm.getFirstname());
            mv.addObject("msg","upload successful");
        }else{
            mv.addObject("msg","upload failed");
        }
        
        }
        else{
            sm.setImage(originalImage);
        }
        
        studentService.update(sm);
        mv.setViewName("redirect:/admin/student/display");
        return mv;
    }
//        
}
