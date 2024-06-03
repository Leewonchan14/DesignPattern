package Visitor;

import Item.Book;
import Item.Pen;

public interface Visitor {
    public void doForBook(Book book);
    public void doForPen(Pen pen);
}
