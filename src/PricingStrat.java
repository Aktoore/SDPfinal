public interface PricingStrat {
    double calcPrice(int duration);
    String getPriceType();
}
