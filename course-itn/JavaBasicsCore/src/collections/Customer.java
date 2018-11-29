/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package collections;

/**
 *
 * @author cswl
 */
public class Customer {

    private int id;
    private String name;
    private String address;
    private long phone;
    private static int sid = 1000;

    public Customer() {
      super();  
      this.id = ++sid;
    };
    
    public Customer(String name, String address, long phone) {
        this(++sid, name, address, phone);
    }

    public Customer(int id, String name, String address, long phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    
}
