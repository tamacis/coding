/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author cswl
 */
public class Book {

    String title;
    String author;
    int price;
    long isbn;
    private static long count = 100000000000L;

    public Book() {
        this.title = "Book Title";
        this.author = "Book Author";
        this.price = 500;
        isbn = (long) (Math.random() * count++);
    }

    public Book(String title, String author, int price, long isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void showBook() {
        System.out.println("TITLE: " + this.title);
        System.out.println("AUTHOR: " + this.author);
        System.out.println("PRICE: " + this.price);
        System.out.println("ISBN: " + this.isbn);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.showBook();
        
        System.out.println("");
        
        Book b2 = new Book("PHP Intro", "JetBrains",
                1400, 2992_2323_2323_123L);
        b2.showBook();
    }

}
