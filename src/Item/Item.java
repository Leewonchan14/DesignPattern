package Item;

import Visitor.Visitor;

public interface Item {
    public void accept(Visitor visitor);
}
