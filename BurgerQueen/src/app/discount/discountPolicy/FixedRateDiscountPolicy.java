package app.discount.discountPolicy;

public class FixedRateDiscountPolicy {
    private int discountRate;

    public FixedRateDiscountPolicy(int discountRate) {
        this.discountRate = discountRate;
    }
    public int calcultateDiscountedPrice(int price) {
        return price - (price * discountRate/100);
    }
}
