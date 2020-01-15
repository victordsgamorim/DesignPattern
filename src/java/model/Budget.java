package java.model;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private double price;
    private List<Item> items = new ArrayList();

    public Budget(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
