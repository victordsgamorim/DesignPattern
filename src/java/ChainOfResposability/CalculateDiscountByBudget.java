package java.ChainOfResposability;

import java.model.Budget;

public class CalculateDiscountByBudget implements Discount {

    private Discount next;

    public double discount(Budget budget) {

        if (budget.getPrice() > 500.0) {
            return 0.07;
        }
        return next.discount(budget);
    }

    @Override
    public void setNext(Discount discount) {
        next = discount;
    }
}
