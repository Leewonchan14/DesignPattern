package Visitor;

import Item.Book;
import Item.Pen;

public class TaxCalculator implements Visitor {
    private float tax = 1.2f;

    @Override
    public void doForBook(Book book) {
        System.out.println("Book tax : " + book.getPrice() * tax);
    }

    @Override
    public void doForPen(Pen pen) {
        System.out.println("Pen tax : " + pen.getPrice() * tax);
    }
}
