public class ISS implements Tax {

    @Override
    public double calculateTax(Budget budget) {
        return budget.getPrice() + budget.getPrice() * 0.5;
    }
}
