package Visitor;

import Item.Book;
import Item.Pen;

public class PriceCalculator implements Visitor {

    @Override
    public void doForBook(Book book) {
        System.out.println("book price : " + book.getPrice());
    }

    @Override
    public void doForPen(Pen pen) {
        System.out.println("pen price : " + pen.getPrice());
    }
}
