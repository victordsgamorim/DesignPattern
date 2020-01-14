import org.jetbrains.annotations.NotNull;

public class CalculateBudget {

    public double calcualte(Budget budget, @NotNull Tax tax) {
        return tax.calculateTax(budget);
    }
}
