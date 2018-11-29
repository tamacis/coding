/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.daoimpl;

import com.cswl.dao.StudentDao;
import com.cswl.model.Student;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PemaSamtenLama
 */
@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public void insert(Student sm) {
    
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(sm);
        session.getTransaction().commit();
        session.close();
    
    }

    @Override
    public List<Student> selectAll() {
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       CriteriaBuilder cb = session.getCriteriaBuilder();
       CriteriaQuery<Student> cq = cb.createQuery(Student.class);
       Root<Student> root = cq.from(Student.class);
       cq.select(root);
       Query<Student> query = session.createQuery(cq);
       List<Student> al = query.getResultList();
       return al;
    }

    @Override
    public Student selectById(int id) {
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       Student sm = session.get(Student.class, id);
       session.close();
       return sm;
    }

    @Override
    public void update(Student sm) {
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       session.update(sm);
       session.getTransaction().commit();
       session.close();
    }

    @Override
    public void delete(Student sm) { 
        
      Session session = sessionFactory.openSession();
      session.beginTransaction();
      session.delete(sm);
      session.getTransaction().commit();
      session.close();
    }
    
}
