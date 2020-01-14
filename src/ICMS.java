public class ICMS implements Tax {

    @Override
    public double calculateTax(Budget budget) {
        double price = budget.getPrice();
        return price + (price* 0.1);
    }
}
