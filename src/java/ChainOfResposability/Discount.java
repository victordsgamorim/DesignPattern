package java.ChainOfResposability;

import java.model.Budget;

public interface Discount {

    double discount(Budget budget);

    void setNext(Discount discount);
}
