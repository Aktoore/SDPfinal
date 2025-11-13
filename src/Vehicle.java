public abstract class Vehicle {
    protected String model;
    protected PricingStrat pricingStrat;
    protected boolean available;

    public Vehicle(String model, PricingStrat pricingStrat)
    {
        this.model = model;
        this.pricingStrat = pricingStrat;
        this.available = true;
    }

    public abstract String getVehicleType();

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
