/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.jsoupdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author cswl
 */
public class UrlParser {

    public static void main(String[] args) {
        Document page = null;

        final String url = "https://www.nrb.org.np/fxmexchangerate.php?YY=&&MM=&&DD=";
        try {

            page = Jsoup.connect(url).get();
        } catch (IOException ex) {
            Logger.getLogger(UrlParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Get the table of Foregin exchange rates:
        // The CSS-3 query is fragile.. 
        // But not the case NRB website has Semantic HTML
        String cssQuery = "table table:nth-child(2) table[width=\"450\"]";
        Elements tables = page.select(cssQuery);
        Element table = tables.iterator().next();
        Elements trows = table.select("tr");

        // Strip off the first two data which are table headers
        // And the last one, which is empty <tr> for whatever reason
        Stream<Element> rowsStream = trows.stream().skip(2).limit(trows.size() - 3);
        ArrayList<Currency> currencyList = new ArrayList<>();
        rowsStream.forEach(row -> {
            // Columns are: Name, Unit, Buy, Sell
            Elements cols = row.select("td");
            String name = cols.get(0).text();
            String unit = cols.get(1).text();
            String buy = cols.get(2).text(); 
            String sell =  cols.get(3).text();
            Currency c = CurrencyParser.parse(name, unit, buy, sell);
            currencyList.add(c);
        });
        
        // print the currency 
        currencyList.stream().forEach(System.out::println);
    }
    
}
