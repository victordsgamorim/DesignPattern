package java.ChainOfResposability;

import java.model.Budget;

public class CalculateDiscountByItems implements Discount {

    private Discount next;

    public double discount(Budget budget) {
        if (budget.getItems().size() > 5) {
            return 0.05;
        }

        return next.discount(budget);
    }

    @Override
    public void setNext(Discount discount) {
        this.next = discount;
    }
}
