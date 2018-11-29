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
public class AbstractTest extends AbstractDemo {
    @Override 
    public void change(int i ) {
        this.i = i;
    }
    
    public static void main(String[] args) {
        AbstractDemo ad = new AbstractTest();
        ad.display();
        ad.change(99);
        ad.display();
    }
}
