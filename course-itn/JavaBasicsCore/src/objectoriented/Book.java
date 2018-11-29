/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author cswl
 */
public class Book {

    protected long isbn;
    protected String title;
    protected String category;

    public void showBook() {
        System.out.println(isbn + " " + title + " " + category);
    }

    Book() {
        super();
    }

    Book(long isbn, String title, String category) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
    }

}
