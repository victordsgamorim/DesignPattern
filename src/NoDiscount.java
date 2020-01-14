public class NoDiscount implements Discount {
    @Override
    public double discount(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(Discount discount) {
        // There isn't next
    }
}
