package java.Strategy;

import org.jetbrains.annotations.NotNull;

import java.model.Budget;

public class CalculateBudget {

    public double calcualte(Budget budget, @NotNull Tax tax) {
        return tax.calculateTax(budget);
    }
}
