import java.util.Dictionary;

public class CalculateDiscount {

    public double calculateDiscount(Budget budget) {

        Discount d1 = new CalculateDiscountByItems();
        Discount d2 = new CalculateDiscountByItems();
        Discount d3 = new NoDiscount();

        d1.setNext(d2);
        d2.setNext(d3);

        return d1.discount(budget);
    }
}
