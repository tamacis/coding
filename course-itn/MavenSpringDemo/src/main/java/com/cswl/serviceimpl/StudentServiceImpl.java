/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.serviceimpl;

import com.cswl.dao.StudentDao;
import com.cswl.model.Student;
import com.cswl.service.StudentService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author PemaSamtenLama
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    
    private static final String UPLOAD_DIR = "/tmp/upload/";
    
     @Autowired
     StudentDao studentDao;
    @Override
    public void insert(Student sm) {
        studentDao.insert(sm);
     }

    @Override
    public List<Student> selectAll() {
         return studentDao.selectAll();
    }

    @Override
    public Student selectById(int id) {
        return studentDao.selectById(id);
    }

    @Override
    public void update(Student sm) {
        studentDao.update(sm);
    }

    @Override
    public void delete(Student sm) {
       studentDao.delete(sm);
    }

    @Override
    public boolean saveImage(MultipartFile file) {
       boolean success = false;
       String fileName = file.getOriginalFilename();
       File savePath = new File(UPLOAD_DIR);
       if(!savePath.exists()){
           savePath.mkdir();
       }
       savePath = new File(UPLOAD_DIR  + fileName);
       
       try{
           file.transferTo(savePath);
           success = true;
       }
       catch(IOException ie){
           System.out.println(ie.getMessage());
       }
       return success;
    }

    @Override
    public boolean deleteImage(String image) {
        boolean success = false;
        File deleteFile = new File(UPLOAD_DIR + image);
        if(deleteFile.exists()){
            success = deleteFile.delete();
        }
        return success;
    }

    @Override
    public boolean updateStudentwithImage(MultipartFile file, String originalImage) {
          boolean success = false;
          if(deleteImage(originalImage))
              success = saveImage(file);
              return success;
          
    }
      
    
    
}
