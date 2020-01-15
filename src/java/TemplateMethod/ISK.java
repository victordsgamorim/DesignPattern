package java.TemplateMethod;

import java.model.Budget;

public class ISK extends TemplateTax {

    @Override
    double minCondition(Budget budget) {
        return budget.getPrice() * 0.05;
    }

    @Override
    double maxCondition(Budget budget) {
        return budget.getPrice() * 0.075;
    }

    @Override
    boolean conditionToRealizeProcess(Budget budget) {
        return budget.getPrice() > 500 || budget.getItems().size() >= 5;
    }
}
