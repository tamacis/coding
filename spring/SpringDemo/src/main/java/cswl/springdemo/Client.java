/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cswl
 */
public class Client {

    public static void main(String[] args) {
//        // Creating objects using BeanFactory
//        Resource resource = new ClassPathResource("EmployeeBean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        //        Employee e1 = (Employee) factory.getBean("emp1");
////        Employee e2 = factory.getBean("emp2", Employee.class);

        // Creating objects using ApplicationContext;
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("EmployeeBean.xml");


        ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
        ctx.close();



    }
}
