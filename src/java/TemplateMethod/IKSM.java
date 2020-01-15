package java.TemplateMethod;

import java.model.Budget;

public class IKSM extends TemplateTax {

    @Override
    double minCondition(Budget budget) {
        return budget.getPrice() * 0.06;
    }

    @Override
    double maxCondition(Budget budget) {
        return budget.getPrice() * 0.1;
    }

    @Override
    boolean conditionToRealizeProcess(Budget budget) {
        return budget.getPrice() > 500;
    }
}
