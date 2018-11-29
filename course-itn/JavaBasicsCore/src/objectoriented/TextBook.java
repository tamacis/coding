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
public class TextBook extends Book {

    int price;
    String author;

    TextBook() {
        super();
    }

    TextBook(long isbn, String title, String category, int price, String author) {
        super(isbn, title, category);
        this.price = price;
        this.author = author;

    }
    
    @Override
    public void showBook() {
        super.showBook();
        System.out.println(price + " " + author);
    }

    public static void main(String[] args) {
        TextBook b1 = new TextBook(1241412123, "Java Pro", "Programming", 1000, "Mark");
        b1.showBook();
    }
}
