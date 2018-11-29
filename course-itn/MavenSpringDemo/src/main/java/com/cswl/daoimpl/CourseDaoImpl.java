/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.daoimpl;

import com.cswl.dao.CourseDao;
import com.cswl.model.Course;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PemaSamtenLama
 */
@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insert(Course cm) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cm);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Course> selectAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> root = cq.from(Course.class);
        cq.select(root);
        Query<Course> query = session.createQuery(cq);
        List<Course> al = query.getResultList();

        //List<Course> all = session.createCriteria(Course.class).list();
        session.close();
        return al;
    }

    @Override
    public Course selectById(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Course cm = session.get(Course.class, id);
        session.close();
        return cm;
    }

    @Override
    public void update(Course cm) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(cm);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void delete(Course cm) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(cm);
        session.getTransaction().commit();
        session.close();

    }

}
