/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

/**
 *
 * @author cswl
 */
public class AsterikPatterns {

    public static void main(String[] args) {
        String patt = "*";
        int mRows = 5;

        // first pattern
        Pattern p1 = new Pattern(mRows, patt);
        for (int i = 0, p = 0, n = 1; i < mRows; i++) {
            p1.display(p, n);
            n++;
        }
        System.out.println();

        //second pattern
        Pattern p2 = new Pattern(mRows, patt);
        for (int i = 0, p = 4, n = 1; i < mRows; i++) {
            p2.display(p, n);
            p--;
            n++;
        }
        System.out.println();

        // third pattern 
        Pattern p3 = new Pattern(mRows, patt);
        for (int i = 0, p = 0, n = 5; i < mRows; i++) {
            p3.display(p, n);
            n--;
        }
        System.out.println();

        // fourth pattern 
        Pattern p4 = new Pattern(mRows, patt);
        for (int i = 0, p = 0, n = 5; i < mRows; i++) {
            p4.display(p, n);
            p++;
            n--;
        }
        System.out.println();

    }
}

class Pattern {

    private int rows;
    private String patt;

    Pattern(int r, String p) {
        this.rows = r;
        this.patt = p;
    }

    public void display(int pleft, int n) {
        String row = "";
        if (pleft > 0) {
            for (int i = 0; i < pleft; i++) {
                row += " ";
            }
        }

        for (int i = 0; i < n; i++) {
            row += this.patt;
        }
        System.out.println(row);
    }

}
