package Item;

import Visitor.Visitor;

public class Book implements Item {
    private int price;
    @Override
    public void accept(Visitor visitor) {
        visitor.doForBook(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
