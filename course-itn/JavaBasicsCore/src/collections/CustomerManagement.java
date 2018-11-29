/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package collections;

import java.util.ArrayList;

/**
 *
 * @author cswl
 */
public class CustomerManagement {

    public static void main(String[] args) {
        ArrayList<Customer> al = new ArrayList<>();

        Customer c1 = new Customer("Arnold", "Hongkong", 980_1827_0112L);
        al.add(c1);

        Customer c2 = new Customer();
        c2.setName("Ron");
        c2.setAddress("Japan");
        c2.setPhone(9810_2801_290L);

        al.add(c2);

        al.add(new Customer("Pharah", "China", 9898_8911_1989L));
        al.add(new Customer("Julia", "Indonesia", 9208_1925_5985L));
        al.add(new Customer("Kim", "China", 9198_1911_2989L));

        System.out.println("Id\tName\tAddress\t\tPhone");
        for (Customer c : al) {
            System.out.println(c.getId() + "\t"
                    + c.getName() + "\t"
                    + c.getAddress() + "\t\t"
                    + c.getPhone() + "\t"
            );
        }

    }
}
