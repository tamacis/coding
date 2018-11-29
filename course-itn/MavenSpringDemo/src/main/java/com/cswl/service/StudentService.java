/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.service;

import com.cswl.model.Student;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author PemaSamtenLama
 */
public interface StudentService {
    
    public void insert(Student sm);
    
    public List<Student> selectAll();
    
    public Student selectById(int id);
    
    public void update(Student sm);
    
    public void delete(Student sm);
    
    public boolean saveImage(MultipartFile file);
    
    public boolean deleteImage(String image);
    
    public boolean updateStudentwithImage(MultipartFile file,String originalImage);
    
}
