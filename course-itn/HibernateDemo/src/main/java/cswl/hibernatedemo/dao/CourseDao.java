/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.hibernatedemo.dao;

import cswl.hibernatedemo.modal.Course;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cswl
 */
public class CourseDao {

    public static void insert() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Course c = new Course();
        c.setTitle("Oracle");
        c.setPrice(32000.0);
        c.setDuration("6 months");

        session.save(c);

        session.getTransaction().commit();
        session.close();
    }

    public static void selectAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Course> al = session.createCriteria(Course.class).list();
        session.getTransaction().commit();
        session.close();

        for (Course c : al) {
            System.out.println(c);
        }

    }

    public static void selectById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Course> al = session.createCriteria(Course.class)
                .add(Restrictions.eq("id", id)).list();
        session.getTransaction().commit();
        session.close();

        for (Course c : al) {
            System.out.println(c);
        }

    }

    public static void update(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Course cm = new Course();
        cm.setId(id);
        cm.setTitle("Core Java");
        cm.setPrice(5000.0);
        cm.setDuration("2 months");

        session.update(cm);

        session.getTransaction().commit();
        session.close();
    }

    public static void delete(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Course cm = new Course();
        cm.setId(id);

        session.delete(cm);

        session.getTransaction().commit();
        session.close();

    }

}
