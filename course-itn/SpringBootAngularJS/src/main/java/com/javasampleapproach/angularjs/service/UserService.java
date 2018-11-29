/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javasampleapproach.angularjs.service;

import com.javasampleapproach.angularjs.model.User;
import java.util.List;

/**
 *
 * @author stim
 */
public interface UserService {
     User findById(long id);
     
    User findByName(String name);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserById(long id);
 
    List<User> findAllUsers();
     
    void deleteAllUsers();
     
    boolean isUserExist(User user);
     
}
