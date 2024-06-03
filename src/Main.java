import Item.*;
import Visitor.PriceCalculator;
import Visitor.TaxCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PriceCalculator priceCalculatorVisitor = new PriceCalculator();
        TaxCalculator taxCalculatorVisitor = new TaxCalculator();

        ArrayList<Item> itemBox = new ArrayList<Item>();

        Book book = new Book();
        book.setPrice(1000);
        itemBox.add(book);

        Pen pen = new Pen();
        pen.setPrice(500);
        itemBox.add(pen);

        for (Item i : itemBox) {
            i.accept(priceCalculatorVisitor);
        }

        for (Item i : itemBox) {
            i.accept(taxCalculatorVisitor);
        }
    }
}
