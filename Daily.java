public class Daily implements PricingStrat{
    private double dayRate;
    public Daily(double dayRate)
    {
        this.dayRate = dayRate;
    }

    @Override
    public double calcPrice(int hours)
    {
        return hours*dayRate;
    }
    @Override
    public String getPriceType()
    {
        return "Hourly";
    }
}
