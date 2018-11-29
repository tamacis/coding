/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author cswl
 */
public class MyADBApp implements DataConnect, DataInterface {

    @Override
    public void connect() {
        System.out.println("Database connect success.");
    }

    @Override
    public void close() {
        System.out.println("Database closed.");
    }

    @Override
    public void showMessage() {
        System.out.println("Database operation performed");
    }

    @Override
    public void insert(int a) {
        System.out.println("Data inserted: " + a);
    }

    @Override
    public void update(int a) {
        System.out.println("Data updated.");
    }

    @Override
    public void delete(int a) {
        System.out.println("Data deleted.");
    }

    @Override
    public void select() {
        System.out.println("All data selected.");
    }

    public static void main(String[] args) {
        MyADBApp app = new MyADBApp();
        app.connect();
        app.insert(1);
        app.showMessage();
        app.update(1);
        app.close();
        
    }
    
}
