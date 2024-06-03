package Item;

import Visitor.Visitor;

public class Pen implements Item {
    private int price;

    @Override
    public void accept(Visitor visitor) {
        visitor.doForPen(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
