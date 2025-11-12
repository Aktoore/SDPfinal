public class Vehicle {
    private String model;
    private PricingStrat pricingStrat;
    private boolean available;

    public Vehicle(String model, PricingStrat pricingStrat)
    {
        this.model = model;
        this.pricingStrat = pricingStrat;
        this.available = true;
    }

    public void setPricingStrat(PricingStrat pricingStrat) {
        this.pricingStrat = pricingStrat;
    }

    public double getPriceTotal(int duration)
    {
        return pricingStrat.calcPrice(duration);
    }

    public String getModel() {
        return model;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
