package cswl.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDI {
    public static void main(String[] args) {
        ApplicationContext context1 =
                new ClassPathXmlApplicationContext("EmployeeDIBean.xml");

        Employee e3 = context1.getBean("emp1", Employee.class);
        ClassPathXmlApplicationContext ctx1 = (ClassPathXmlApplicationContext) context1;
        ctx1.close();
    }
}
