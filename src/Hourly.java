public class Hourly implements PricingStrat{
    private double hourRate;
    public Hourly(double hourRate)
    {
        this.hourRate = hourRate;
    }

    @Override
    public double calcPrice(int hours)
    {
        return hours*hourRate;
    }
    @Override
    public String getPriceType()
    {
        return "Hourly";
    }
}
