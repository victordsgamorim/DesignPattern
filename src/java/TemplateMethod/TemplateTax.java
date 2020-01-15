package java.TemplateMethod;

import java.Strategy.Tax;
import java.model.Budget;

public abstract class TemplateTax implements Tax {

    @Override
    public double calculateTax(Budget budget) {
        if (conditionToRealizeProcess(budget)) {
            return maxCondition(budget);
        }
        return minCondition(budget);
    }

    abstract double minCondition(Budget budget);
    abstract double maxCondition(Budget budget);
    abstract boolean conditionToRealizeProcess(Budget budget);
}
